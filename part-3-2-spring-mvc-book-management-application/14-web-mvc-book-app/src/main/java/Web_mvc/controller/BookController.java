package Web_mvc.controller;

import Web_mvc.entity.Book;
import Web_mvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController
{

    @Autowired
    private BookService bookService;

    @GetMapping({"/index"})
    public String index(@ModelAttribute("book") Book book)
    {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("book", new Book());
//        mav.setViewName("index");
        return "index";
    }


    @PostMapping("/book")
    public ModelAndView saveBook(Book book)
    {
        ModelAndView mav = new ModelAndView();

        boolean status = bookService.saveBook(book);
        if (status)
        {
            mav.addObject("succMsg", "Book Saved");
        }
        else
        {
            mav.addObject("errMsg", "Failed to save");
        }

        mav.setViewName("index");

        return mav;
    }


    @GetMapping("/books")
    public ModelAndView getUser()
    {

        ModelAndView mav = new ModelAndView();
        List<Book> allBooks = bookService.getAllBooks();

        mav.addObject("books", allBooks);

        mav.setViewName("booksView");
        return mav;
    }


    @GetMapping("/delete")
    public ModelAndView deleteBook(@RequestParam("bookId") Integer bookId)
    {

        bookService.deleteBook(bookId);

        ModelAndView mav = new ModelAndView();
        List<Book> allBooks = bookService.getAllBooks();

        mav.addObject("books", allBooks);

        mav.setViewName("booksView");
        return mav;
    }


    @GetMapping("/edit")
    public ModelAndView editBook(@RequestParam("bookId") Integer bookId)
    {

        Book bookObj = bookService.getBookById(bookId);

        ModelAndView mav = new ModelAndView();

        mav.addObject("book", bookObj);
        mav.setViewName("index");

        return mav;
    }

}
