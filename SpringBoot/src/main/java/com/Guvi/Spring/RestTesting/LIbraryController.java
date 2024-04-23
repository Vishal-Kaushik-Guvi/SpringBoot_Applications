package com.Guvi.Spring.RestTesting;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("books")
public class LIbraryController {

    @GetMapping("getbook")
    public Library getData() {
        Library obj = new Library();
        obj.setBookName("Life of Two Bells");
        obj.setBookAuthor("Mark Leif");
        return obj;
    }

    @PostMapping(value = "makebook", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Library createBook(@RequestBody Library lib) {
        System.out.println("Received book data: " + lib);
        return lib;
    }
}
