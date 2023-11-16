package Day44;

import java.lang.reflect.Array;

public class Question {
        private String questionText;
       private int correctOption;

  public Question ( String questionText, int correctOption){
      this.questionText = questionText;
      this.options = options;
      this.correctOption = correctOption;

  }

  public void displayQuestion(){
      System.out.println(questionText);
      int on = 1;
      for(String  option : options){
          System.out.println(on + ",");
          System.out.println(option);
      }

    }
    public String getQuestionText(){
      return  questionText;
    }
    public ArrayList<String>getOptions(){
      return  options;
    }
    public int getCorrectOption(){
      return  correctOption;
    }

}
