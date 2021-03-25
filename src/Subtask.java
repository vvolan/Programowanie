pakiet  Lab03 ;

import  Lab02.Task ;
import  Lab02.taskCategory ;
import  lombok. * ;

@NoArgsConstructor


public  class  Podzadanie  rozszerza  zadanie {

    private  String subtaskName;

    String  getSubtaskName () {

        return  null ;

    }

    void  SubtaskName ( String  subtaskName ) {

    }

    @Nadpisanie

    public  String  toString () {

        return  " Podzadanie { "  +

                " subtaskName = ' "  + subtaskName +  ' \ ' '  +

        ' } ' ;
    }



    publicznego  Zadanie ( String  TaskName , String  taskDescription , Lab02 . taskCategory  taskCategory , String  taskDateTimeStop , String  subtaskName ) {

        super (nazwa_zadania, opis_zadania, kategoria_zadań ,_zadanieTimeStop);

        to . subtaskName = subtaskName;

    }

}