package day2;

public class ProductQA {
    /*
        Product ID (long)
        Question (String)
        Questioning User Id (long)
        Questioned Time => 2023-04-15 07:20:43 (int)
        Answer (String)
        Answering User => By Default The Vendor Selling product (String)
        Answered Time (int)
        Hide Questioner Identity (String)
     */

    long productId;
    String question;
    long questioningUserId;
    int questionedTime;
    String answer;
    String answeringUser;
    int answeredTime;
    String hideQuestionerIdentity;
}
