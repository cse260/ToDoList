/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test3;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void shouldReturnExerciseWhenAddExercise()
    {
        ThingList thingList = new ThingList();
        List<String> expectedResult1 = thingList.addThing("Exercise");
        String expectedResult="";
        expectedResult=expectedResult1.toString();
        Assertions.assertEquals("[Exercise]", expectedResult);
    }

    @Test
    void shouldReturnEatWhenDeleteExercise()
    {
        ThingList thingList = new ThingList();
        thingList.addThing("Exercise");
        thingList.addThing("Eat");
        List<String> expectedResult1 = thingList.deleteThing("Exercise");
        String expectedResult="";
        expectedResult=expectedResult1.toString();
        Assertions.assertEquals("[Eat]", expectedResult);
    }

    @Test
    void shouldReturnExerciseWhenChangeExercise()
    {
        ThingList thingList = new ThingList();
        thingList.addThing("Exercise");
        thingList.addThing("Eat");
        List<String> expectedResult1 = thingList.changeToFinish("Exercise");
        String expectedResult="";
        expectedResult=expectedResult1.toString();
        Assertions.assertEquals("[Exercise]", expectedResult);
    }

}
