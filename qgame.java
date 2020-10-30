//package com.quizapplication;
import  java.util.*;
class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"what is capital of india?","The World Largest desert is ?","Mount Everest is located in ?"};
    String[] options1={"Delhi","Thar","India"};
    String[] options2={"Mumbai","Kalahari","Nepal"};
    String[] options3={"Chennai","Sahara","Tibet"};
    String[] options4={"Jaypur","Sonoran","China"};
    int[] answers={1,3,2};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

			questions[i].question=questionsdata[i];
			questions[i].option1=options1[i];
			questions[i].option2=options2[i];
			questions[i].option3=options3[i];
			questions[i].option4=options4[i];
			questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Great job!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Sorry wrong answer");
                 
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}

 class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("Enter player name");
        name=sc.next();

    }

}

 class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
       return false;
    }

}

public class qgame 
{
   public static void main(String[] args) {
	// Quiz application
        Game game=new Game();
        game.initGame();
        game.play();

    }
}
