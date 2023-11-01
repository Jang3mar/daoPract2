package com.example.pract2up.dao;

import com.example.pract2up.models.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllDAO {
    private static int ANIMAL_COUNT;
    private static int CARS_COUNT;
    private static int HOUSES_COUNT;
    private static int PEOPLE_COUNT;
    private static int BOOKS_COUNT;

    private List<Animals> animalsList;
    {
        animalsList = new ArrayList<>();

        animalsList.add(new Animals(++ANIMAL_COUNT, "кот", "Марсик", 11, "черный"));
        animalsList.add(new Animals(++ANIMAL_COUNT, "кот", "Жора", 3, "серый"));
        animalsList.add(new Animals(++ANIMAL_COUNT, "кошка", "Лаки", 5, "серая"));
        animalsList.add(new Animals(++ANIMAL_COUNT, "собака", "Юля", 3, "белый"));
        animalsList.add(new Animals(++ANIMAL_COUNT, "собака", "Шницель", 3, "белая"));
    }

    private List<Cars> carsList;
    {
        carsList = new ArrayList<>();

        carsList.add(new Cars(++CARS_COUNT, "LADA Granta", "-", 1000000, "Белый"));
        carsList.add(new Cars(++CARS_COUNT, "UAZ Patriot", "-", 153000, "Серый"));
        carsList.add(new Cars(++CARS_COUNT, "Toyota CAMRY", "-",  2498000, "Белый"));
        carsList.add(new Cars(++CARS_COUNT, "Jeep Wrangler", "", 4920000, "Красный"));
        carsList.add(new Cars(++CARS_COUNT, "Porsche Cayman", "718", 8000000, "Черный"));
    }

    private List<Houses> housesList;
    {
        housesList = new ArrayList<>();

        housesList.add(new Houses(++HOUSES_COUNT, "Кировская область, город Дмитров, проезд Бухарестская, 02", 1, "Белый", 10000000));
        housesList.add(new Houses(++HOUSES_COUNT, "Ульяновская область, город Раменское, спуск Сталина, 54", 2, "Белый", 20900000));
        housesList.add(new Houses(++HOUSES_COUNT, "Томская область, город Красногорск, пр. 1905 года, 29", 1, "Коричневый", 15900000));
        housesList.add(new Houses(++HOUSES_COUNT, "Свердловская область, город Домодедово, ул. Ленина, 99", 3, "Белый", 45000500));
        housesList.add(new Houses(++HOUSES_COUNT, "Челябинская область, город Пушкино, ул. Гагарина, 12", 2, "Серый", 26005600));
    }

    private List<People> peopleList;
    {
        peopleList = new ArrayList<>();

        peopleList.add(new People(++PEOPLE_COUNT, "Волков Матвей Дмитриевич", 34, "matVolf@gmail.com", "11.06.1989"));
        peopleList.add(new People(++PEOPLE_COUNT, "Семенов Мирон Георгиевич", 23, "mirSem@gmail.com", "01.01.2000"));
        peopleList.add(new People(++PEOPLE_COUNT, "Абрамова Надежда Александровна", 55, "nadABR@gmail.com", "04.02.1968"));
        peopleList.add(new People(++PEOPLE_COUNT, "Федоров Илья Максимович", 26, "ilFedX@gmail.com", "23.10.1997"));
        peopleList.add(new People(++PEOPLE_COUNT, "Андреева Злата Максимовна", 47, "zlAndrew@gmail.com", "01.01.1976"));
    }

    private List<Books> booksList;
    {
        booksList = new ArrayList<>();

        booksList.add(new Books(++BOOKS_COUNT, "1984", "Джордж Оруэлл", 1949, 320));
        booksList.add(new Books(++BOOKS_COUNT, "Лолита", "Владимир Набоков", 1955, 368));
        booksList.add(new Books(++BOOKS_COUNT, "Божественная комедия", "Данте Алигьери", 1472, 768));
        booksList.add(new Books(++BOOKS_COUNT, "Унесенные ветром", "Маргарет Митчелл", 1936, 704));
        booksList.add(new Books(++BOOKS_COUNT, "Великий Гэтсби", "Фрэнсис Скотт Фицджеральд", 1925, 256));
    }

    public List<Animals> indexAnimal(){ return animalsList;}
    public Animals showAnimal(int id){return animalsList.stream().filter(animals -> animals.getAnimalID() == id).findAny().orElse(null);}
    public List<Cars> indexCar(){
        return carsList;
    }
    public Cars showCar(int id){return carsList.stream().filter(cars -> cars.getCarsID() == id).findAny().orElse(null);}
    public List<Houses> indexHouse() {return housesList;}
    public Houses showHouse(int id) {return housesList.stream().filter(houses -> houses.getHousesID() == id).findAny().orElse(null);}
    public List<People> indexPeople(){
        return peopleList;
    }
    public People showPeople(int id){return peopleList.stream().filter(people -> people.getPeopleID() == id).findAny().orElse(null);}
    public List<Books> indexBook(){
        return booksList;
    }
    public Books showBook(int id){return booksList.stream().filter(books -> books.getBooksID() == id).findAny().orElse(null);}

    public <T> void add(T object){
        if(object.getClass() == Animals.class){
            ((Animals) object).setAnimalID(++ANIMAL_COUNT);
            animalsList.add((Animals)object);
        }
        else if (object.getClass() == Books.class){
            ((Books) object).setBooksID(++BOOKS_COUNT);
            booksList.add((Books) object);
        }
        else if (object.getClass() == Cars.class){
            ((Cars) object).setCarsID(++CARS_COUNT);
            carsList.add((Cars) object);
        }
        else if (object.getClass() == Houses.class){
            ((Houses) object).setHousesID(++HOUSES_COUNT);
            housesList.add((Houses) object);
        }
        else if (object.getClass() == People.class){
            ((People) object).setPeopleID(++PEOPLE_COUNT);
            peopleList.add((People) object);
        }
    }
}
