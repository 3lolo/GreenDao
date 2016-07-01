package com.example;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.ToMany;
import de.greenrobot.daogenerator.DaoGenerator;

public class MyDaoGenerator {
    public static void main(String args[]) throws Exception {
        //generateSensorDao();
        genrateAcuDao();
    }

    public static void generateSensorDao( ){
        Schema schema = new Schema(1, "Objects.dao");

        Entity surveys = schema.addEntity("Measure");
        surveys.addIdProperty();
        surveys.addFloatProperty("tempirature");
        surveys.addFloatProperty("pressure");
        surveys.addFloatProperty("current");
        surveys.addStringProperty("time");
        try {
            new DaoGenerator().generateAll(schema, "../app/src/main/java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void genrateAcuDao(){
        Schema schema = new Schema(1, "com.android.acusurvey.dao");

        Entity surveys = schema.addEntity("Surveys");
        surveys.addIdProperty();
        surveys.addStringProperty("surveyls_title");
        surveys.addStringProperty("format");
        surveys.addStringProperty("value");


        Entity u_servey = schema.addEntity("SurveyU");
        u_servey.addIdProperty().autoincrement();
        u_servey.addIntProperty("sid");
        u_servey.addStringProperty("date");
        u_servey.addStringProperty("active");
        u_servey.addStringProperty("title");


        Entity group = schema.addEntity("Group");
        group.addIdProperty();
        group.addIntProperty("sid");
        group.addStringProperty("group_name");
        group.addStringProperty("description");
        group.addStringProperty("language");
        group.addIntProperty("group_order");
        group.addStringProperty("randomization_group");
        group.addStringProperty("grelevance");

        Entity question = schema.addEntity("Question");
        question.addIdProperty();
        question.addIntProperty("gid");
        question.addIntProperty("sid");
        question.addStringProperty("type");
        question.addStringProperty("title");
        question.addStringProperty("question");
        question.addStringProperty("help");
        question.addStringProperty("mandatory");
        question.addStringProperty("relevance");
        question.addStringProperty("attributes");
        question.addIntProperty("question_order");

        Entity user = schema.addEntity("User");
        user.addIdProperty();
        user.addStringProperty("login");
        user.addStringProperty("password");
        user.addStringProperty("url");
        user.addStringProperty("sessionkey");
        user.addStringProperty("activeDate");

        Entity answer = schema.addEntity("Answers");
        answer.addIdProperty();
        answer.addIntProperty("qid");
        answer.addStringProperty("answer");
        answer.addIntProperty("assessment_value");
        answer.addIntProperty("scale_id");
        answer.addStringProperty("code");


        Entity u_answer = schema.addEntity("AnswersU");
        u_answer.addIdProperty().autoincrement();
        u_answer.addIntProperty("qid");
        u_answer.addIntProperty("sid");
        u_answer.addIntProperty("gid");
        u_answer.addIntProperty("u_sid");
        u_answer.addStringProperty("answer");
        u_answer.addStringProperty("code");


        Entity aprop = schema.addEntity("AnswersP");
        aprop.addStringProperty("available_answers");
        aprop.addStringProperty("subquestions");
        aprop.addStringProperty("attributes");
        aprop.addStringProperty("attributes_lang");

        try {
            new DaoGenerator().generateAll(schema, "../app/src/main/java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
