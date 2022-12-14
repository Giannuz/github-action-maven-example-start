import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDeepThought {

        @Test
        void testAnswerToAll(){
            DeepThought superComputer = new DeepThought();
            assertEquals( 42 , superComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything());
        }

}