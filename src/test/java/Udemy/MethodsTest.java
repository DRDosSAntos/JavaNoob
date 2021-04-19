package Udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    @Test
    void calculateTest(){
        // given:
        Methods m = new Methods();

        // when:
        String gev1 =  m.calculate(2000);

        // then:
        assertEquals("1st place" ,gev1);

        //if(gev1.equals("1st place")){
            // het is ok
        //}

    }

    @Test
    void calculateTest2(){
        // given
        Methods m2 = new Methods();

        // when
        String gev2 = m2.calculate(800);

        // then
        assertEquals("2nd place", gev2);
    }
    void calculateTest3(){
        // given

        // when
        // then
    }



}