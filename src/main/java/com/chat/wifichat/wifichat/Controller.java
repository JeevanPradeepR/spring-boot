package com.chat.wifichat.wifichat;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    /*
    *  List<Book> list=new ArrayList<Book>();
    //Creating Books
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
    //Adding Books to list
    list.add(b1);
    list.add(b2);
    list.add(b3);  */
List<Modal> list = new ArrayList<>();
    @GetMapping("/get")
    public List<Modal> getAll(){
        return list;
    }
    @PostMapping("/add/{message}")
    public String save(@PathVariable String message){
        list.add(new Modal(message));
        return message;
    }
    @DeleteMapping("/del")
    public String remove(){
        list.clear();
        return "cleared all";
    }

}
