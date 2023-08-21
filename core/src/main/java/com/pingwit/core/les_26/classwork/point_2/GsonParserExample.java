package com.pingwit.core.les_26.classwork.point_2;

import com.google.gson.Gson;
import com.pingwit.core.les_26.classwork.point_1.Student;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class GsonParserExample {

    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_26/classwork/point_1/student.json";

    public static void main(String[] args) throws FileNotFoundException {
        //write
        String json = " {\n"
            + "    \"id\": 2,\n"
            + "    \"name\": \"Pasha\",\n"
            + "    \"course\": \"C#\"\n"
            + "  }";
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject);
        int id = jsonObject.getInt("id");
        System.out.println(id);

        JSONObject jsonFromPut = new JSONObject();
        jsonFromPut.put("name", "John");
        jsonFromPut.put("age", 23);
        jsonFromPut.put("city", "Chicago");
        System.out.println(jsonFromPut);

        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 23);
        map.put("city", "Chicago");
        JSONObject jsonFromMap = new JSONObject(map);
        System.out.println(jsonFromMap);

        //read
        Gson gson = new Gson();
        FileReader fileReader = new FileReader(FILE_PATH);
        Student student = gson.fromJson(fileReader, Student.class);
        System.out.println(student);
    }
}
