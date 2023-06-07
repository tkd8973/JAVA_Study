package io.playdata.security.login.service;

import io.playdata.security.board.model.BoardDTO;
import io.playdata.security.board.repository.BoardRepository;
import io.playdata.security.login.model.AccountDTO;
import io.playdata.security.login.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    // register
    public AccountDTO register(AccountDTO accountDTO) throws Exception {
        // username 중복?
        if (accountRepository.findByUsername(accountDTO.getUsername()) != null) {
            throw new Exception("중복된 유저");
            // 예외 처리 1 : try - catch 문
            // 예외 처리 2 : 상위 메소드, 클래스에게 처리 요청
        }
        String newPassword = passwordEncoder.encode(accountDTO.getPassword());
        accountDTO.setPassword(newPassword);
        // TODO : Spring Security 관련
        // 로그인 할땐 bcrypt, 가입할땐 X
        return accountRepository.save(accountDTO);
    }

    public AccountDTO getAccountByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    public void deleteAccountByUsername(String username) throws Exception {
        AccountDTO account = accountRepository.findByUsername(username);
         if (account == null) {
            throw new Exception("유저를 찾을 수 없습니다");
        }
         accountRepository.delete(account);
    }
}
