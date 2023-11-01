package com.example.pract2up.controller;

import com.example.pract2up.dao.AllDAO;
import com.example.pract2up.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String showHome(){
        return "home";
    }

    private final AllDAO _allDAO;

    @Autowired
    public HomeController(AllDAO allDAO){
        this._allDAO = allDAO;
    }

    @GetMapping("/home/indexAnimal")
    public String animalIndex(Model model){
        model.addAttribute("animalsList", _allDAO.indexAnimal());//список всех животных
        return "indexAnimal";
    }

    @GetMapping("/home/indexBook")
    public String bookIndex(Model model){
        model.addAttribute("booksList", _allDAO.indexBook());//список всех книг
        return "indexBook";
    }

    @GetMapping("/home/indexCar")
    public String carIndex(Model model){
        model.addAttribute("carsList", _allDAO.indexCar());//список всех машин
        return "indexCar";
    }

    @GetMapping("/home/indexHouse")
    public String houseIndex(Model model){
        model.addAttribute("housesList", _allDAO.indexHouse());//список всех домов
        return "indexHouse";
    }

    @GetMapping("/home/indexPeople")
    public String peopleIndex(Model model){
        model.addAttribute("peopleList", _allDAO.indexPeople());//список всех людей
        return "indexPeople";
    }

    @GetMapping("/home/indexAnimal/showAnimal/{id}")
    public String animalShow(@PathVariable("id") int id, Model model){
        model.addAttribute("animals", _allDAO.showAnimal(id));//получение одного животного по id
        return "showAnimal";
    }

    @GetMapping("/home/indexBook/showBook/{id}")
    public String bookShow(@PathVariable("id") int id, Model model){
        model.addAttribute("books", _allDAO.showBook(id));
        return "showBook";
    }

    @GetMapping("/home/indexCar/showCar/{id}")
    public String carShow(@PathVariable("id") int id, Model model){
        model.addAttribute("cars", _allDAO.showCar(id));
        return "showCar";
    }

    @GetMapping("/home/indexHouse/showHouse/{id}")
    public String houseShow(@PathVariable("id") int id, Model model){
        model.addAttribute("houses", _allDAO.showHouse(id));
        return "showHouse";
    }

    @GetMapping("/home/indexPeople/showPeople/{id}")
    public String peopleShow(@PathVariable("id") int id, Model model){
        model.addAttribute("people", _allDAO.showPeople(id));
        return "showPeople";
    }

    @PostMapping("/home/CRUDresult")
    public RedirectView newAdd(Model model,
                               @RequestParam (name = "param1", required = false, defaultValue = "-") String param1,
                               @RequestParam (name = "param2", required = false, defaultValue = "-") String param2,
                               @RequestParam (name = "param3", required = false, defaultValue = "-") String param3,
                               @RequestParam (name = "param4", required = false, defaultValue = "-") String param4,
                               @RequestParam (name = "type5", required = false, defaultValue = "-") String type5){
        String returnString = "home";
        try {
            Object object = new Object();
            switch (type5) {
                case "a":
                    object = new Animals(0, param1, param2, Integer.parseInt(param3), param4);
                    returnString = "indexAnimal";
                    break;
                case "b":
                    object = new Books(0, param1, param2, Integer.parseInt(param3), Integer.parseInt(param4));
                    returnString = "indexBook";
                    break;
                case "c":
                    object = new Cars(0, param1, param2, Double.parseDouble(param3), param4);
                    returnString = "indexCar";
                    break;
                case "h":
                    object = new Houses(0, param1, Integer.parseInt(param2), param3, Double.parseDouble(param4));
                    returnString = "indexHouse";
                    break;
                case "p":
                    object = new People(0, param1, Integer.parseInt(param2), param3, param4);
                    returnString = "indexPeople";
                    break;
            }
            if(object.getClass() != Object.class) {
                _allDAO.add(object);
            }
        }
        catch (Exception e){
            model.addAttribute("message", "Что то пошло не так");
        }
        return new RedirectView(returnString);
    }
}
