import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {

    @Test

    public void testGoogle(){
        open("https://www.google.ru/");
        $x("//textarea[@name='q']").setValue("Мирошниченко Дмитрий Сергеевич").pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
    }
}
