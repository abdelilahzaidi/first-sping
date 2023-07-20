package be.bxlformation.api.task.service;

import be.bxlformation.api.task.model.entity.Task;
import be.bxlformation.api.task.model.entity.Urgence;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService  {

//Initialiser et instancier une liste de tâches pour simuler le comportement d'une base de données

    private long nextId=4;
    private List<Task> task=new ArrayList<>();

    Task task1=new  Task(1,"learn C++", Urgence.HIGH,LocalDate.parse("2023-07-25"));
    Task task2=new  Task(2,"learn C",Urgence.LOW,LocalDate.parse("2023-07-25"));
    Task task3=new  Task(3,"learn Java",Urgence.NORMAL,LocalDate.parse("2023-07-25"));



    public void init(){
        task.add(task1);
        task.add(task2);
        task.add(task3);

    }

    public List<Task> all(){
        if(task.size()<3){
            init();
        }
        return  task;
    }
    public Task get(long index){
        return task.get((int)index);
    }

    public void add(Task element) {
        element.setUniqueID(nextId++);
        task.add(element);
    }
  public void update(Long id,Task task){
        Task toUpdate=getOne(id);
  }
  public void upUrgency(Long id){}
  public void downUrgency(Long id){}

}


