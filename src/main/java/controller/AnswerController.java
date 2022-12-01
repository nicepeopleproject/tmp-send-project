package controller;

import model.Answer;
import service.AnswerService;

import java.util.List;

public class AnswerController {
    AnswerService answerService;

    public List<Answer> getLastAnswers(){
        return answerService.getLastAnswersByUserId(null);
    }

    public void saveAnswers(){

    }

    public List<Answer> getAttrHistory(String userLabel, String attrLabel){
        return answerService.getAnswerByAttrLabelForUser(userLabel, attrLabel);
    }
}
