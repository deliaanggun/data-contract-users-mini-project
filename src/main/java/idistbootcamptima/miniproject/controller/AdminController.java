//package idistbootcamptima.miniproject.controller;
//
//import idistbootcamptima.miniproject.model.dao.User;
//import idistbootcamptima.miniproject.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RequestMapping(method = RequestMethod.GET, value = "/api")
//@RequiredArgsConstructor
//public class AdminController {
//    private UserService userService;
//
//    @GetMapping("/admin")
//    public ResponseEntity<List<User>> getUsers(){
//
//        return ResponseEntity.ok().body(userService.getUsers());
//    }
//
//}
//
