package ui;

import org.openqa.selenium.By;

public class TodoPage {
    public static By addProyect = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]");
    public static By nameProduct = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By createButton = By.xpath("//*[@id=\"NewProjNameButton\"]");
    public static By titleProyect = By.xpath("//*[@id=\"CurrentProjectTitle\"]");
    public static By newTodoText = By.xpath("//*[@id=\"NewItemContentInput\"]");
    public static By addNewTodo = By.xpath("//*[@id=\"NewItemAddButton\"]");


}
