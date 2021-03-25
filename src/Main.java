pakiet  Lab03 ;

import  Lab02.Task ;
import  Lab02.taskCategory ;


public  class  Main {

    public  static  void  main ( String [] args ) {

        Zadanie zad1 =  nowe  Zadanie ( " Polutować " , " Napisać aplikacje " , taskCategory . IN_PROGRESS );

        Podzadanie zad2 = ( Podzadanie ) nowe  Zadanie ( " Sprawozdanie " , " Pojechac do sklepu " , taskCategory . DONE );

        Zadanie zad3 = ( Zadanie ) nowy  obiekt ();

        Podzadanie zad4 = ( Podzadanie ) new  Object ();

    }

    public  void  getDetailInfo ( Object  o );

}