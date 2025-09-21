package kz.example.Lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    List <Items> itemList = new ArrayList<>();

    @GetMapping("/")
    public String mainPage(Model model){
        List<Items> itemList = new ArrayList<>();

        // Добавляем 4 объекта Items
        itemList.add(new Items( "Laptop", "Powerful gaming laptop", 1500.00));
        itemList.add(new Items("Phone", "Latest smartphone with OLED display", 999.99));
        itemList.add(new Items("Headphones", "Noise-cancelling wireless headphones", 199.50));
        itemList.add(new Items( "Keyboard", "Mechanical keyboard with RGB lighting", 120.00));
        model.addAttribute("items",itemList);
        return "main_page";
    }
}
