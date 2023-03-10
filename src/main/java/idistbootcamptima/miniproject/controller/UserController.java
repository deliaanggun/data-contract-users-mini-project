package idistbootcamptima.miniproject.controller;

import idistbootcamptima.miniproject.model.dao.Transaction;
import idistbootcamptima.miniproject.model.dao.User;
import idistbootcamptima.miniproject.service.TransactionService;
import idistbootcamptima.miniproject.service.UserService;
import idistbootcamptima.miniproject.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;
    private final UserServiceImpl userServiceImpl;

    private final TransactionService transactionService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/back-office")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok().body(userServiceImpl.getAllUsers());
    }

    @GetMapping("/back-office/transaction")
    public ResponseEntity<List<Transaction>> getAllTransaction(){
        return ResponseEntity.ok().body(transactionService.getTransactions());
    }
}
