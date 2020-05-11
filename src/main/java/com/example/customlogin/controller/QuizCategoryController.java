



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
// fix
/*@RestController
public class QuizCategoryController {

    private List<QuizCategoryForm> quizCategoryList;

    public QuizCategoryController() {
        this.quizCategoryList = new ArrayList<>();
        quizCategoryList.add(new QuizCategoryForm("1. 30 sekund"));
        quizCategoryList.add(new QuizCategoryForm("2. Polskie kluby w pucharach - życie i twórczość"));
        quizCategoryList.add(new QuizCategoryForm("3. Astronomia i Astrologia"));
        quizCategoryList.add(new QuizCategoryForm("4. Biologia"));
        quizCategoryList.add(new QuizCategoryForm("5. Cytaty"));
        quizCategoryList.add(new QuizCategoryForm("6. Kulinaria"));
        quizCategoryList.add(new QuizCategoryForm("7. Patryk Lipski - osąd bohatera"));
        quizCategoryList.add(new QuizCategoryForm("8. Rozmaitości"));
        quizCategoryList.add(new QuizCategoryForm("9. Sędziowie"));
        quizCategoryList.add(new QuizCategoryForm("10.Trzy kolory"));
        quizCategoryList.add(new QuizCategoryForm("11. Wielcy Polacy"));

    }

    @GetMapping("/quizPage")
    public ModelAndView quizCategory() {
        ModelAndView mvn = new ModelAndView("quizPage");
        mvn.addObject("quizCategory", quizCategoryList);
        return mvn;
    }
}


 */