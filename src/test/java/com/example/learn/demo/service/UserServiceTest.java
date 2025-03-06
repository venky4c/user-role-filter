package com.example.learn.demo.service;

import com.example.learn.demo.dto.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserService userService;
    @Test
    void myTestCase(){
        System.out.println("started testing");
    }
    @Test
     void reverse() {
        final String str="Hello";
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("reverse is "+sb.toString());
    }
    @Test
    void listUsersTest(){

       List<User> userList=userService.getUserList();    //Arrays.asList(new User(1,"vasu","admin")); //

        Mockito.verify(userService,times(1)).getUserList();

    }

  @Test
    void countAdverbs(){
      //  String sentence ="She ran hurriedly towards the stadium.";
        String sentence="Lily was happily, crazily, foolishly over the moon.";
        String[] words=sentence.split(" ");

        int count=0;
        for(int i=1;i<words.length;i++){
            if(words[i].endsWith("ly") || words[i].endsWith("ly,"))
                count++;
        }
      System.out.println(" no of adverbs are "+count);
        int i=0;int count_words=0;
        for(String word:words){
            if(i>0 && (word.endsWith("ly") || word.endsWith("ly,")))
                count_words++;
                i++;

        }
      System.out.println(" no of adverbs are "+count_words);
      System.out.println(" no of adverbs are "+Arrays.asList(sentence.split(" ")).stream().filter(eachString->eachString.endsWith("ly") || eachString.endsWith("ly,")).skip(1).count());

  }
  @Test
    void commonStringsFromTwoArrays(){
        List<String> lstStr1=Arrays.asList("come","home","when","you","are","free");
        List<String> lstStr2=Arrays.asList("come","to","school","when","he","is","free");

        List newList= (List) lstStr1.stream().filter(s -> lstStr2.contains(s)).collect(Collectors.toList());
        System.out.println(newList);

  }
  @Test
    void compareTwoEmployees(){
        
  }
}
