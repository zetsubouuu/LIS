import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;

public class LabSeven {
    @Test
    public void SiteOpen()
    {
        //Test1
        Configuration.holdBrowserOpen = true;
        open("https://eda.yandex.ru/retail/paterocka?placeSlug=pyaterochka_s329x");
    }
    @Test
    public void CookedFoodClick() {
        //Test2
        $x("//a[@href='/retail/paterocka/catalog/165?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void VegetablesAndGreensClick() {
        //Test3
        $x("//a[@href='/retail/paterocka/catalog/1034?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void MeetButton() {
        //Test4
        $x("//a[@href='/retail/paterocka/catalog/178?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void MainPageClick() {
        //Test5
        $x("//a[@href='/retail/paterocka']").click();
        sleep(500);
    }
    @Test
    public void ForAnimalsClick() {
        //Test6
        $x("//a[@href='/retail/paterocka/catalog/19286?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void CandyButton() {
        //Test7
        $x("//a[@href='/retail/paterocka/catalog/139?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void FishButton() {
        //Test8
        $x("//a[@href='/retail/paterocka/catalog/178?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void NaggetsClick() {
        //Test9
        $x("//a[@href='/retail/paterocka/catalog/12881?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void BAndIClick() {
        //Test10
        $x("//a[@href='/retail/paterocka/catalog/182?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void Cheese() {
        //Test11
        $x("//a[@href='/retail/paterocka/catalog/167?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void SausageClick() {
        //Test12
        $x("//a[@href='/retail/paterocka/catalog/148?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void FreezingClick() {
        //Test13
        $x("//a[@href='/retail/paterocka/catalog/147?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void PushClick() {
        //Test14
        $x("//a[@href='/retail/paterocka/catalog/19288?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void Coffee() {
        //Test15
        $x("//a[@href='/retail/paterocka/catalog/19289?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void OilClick() {
        //Test16
        $x("//a[@href='/retail/paterocka/catalog/19283?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void Preserves() {
        //Test17
        $x("//a[@href='/retail/paterocka/catalog/19291?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void NutsClick() {
        //Test18
        $x("//a[@href='/retail/paterocka/catalog/30191?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void ForKids() {
        //Test19
        $x("//a[@href='/retail/paterocka/catalog/21575?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
    @Test
    public void MainButtonClick() {
        //Test20
        $x("//a[@href='/retail/paterocka/catalog/3374?placeSlug=pyaterochka_s329x']").click();
        sleep(500);
    }
}


