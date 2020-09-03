@hotelolusturma1
Feature: Hotel_Olusturma01
  Scenario: AC-01: Yönetici olarak tüm kutulara gecerli veri girerek bir oteli kaydetmeliyim

    Given Log in sayfasina gidin
    When UserName metin kutusunu tıklayın ve yazın
    And Password metin kutusunu tıklayın ve yazın
    And LOG IN düğmesine tıklayın
    And Hotel Management butonuna tiklayin
    And Hotel List butonuna tiklayin
    And Add Hotel butonuna tiklayin
    And Code metin kutusunu tıklayın ve geçerli kodu yazın
    And Name metin kutusunu tıklayın ve geçerli bir ad yazın
    And Address metin kutusuna tiklayin ve adres yazin
    And Phone metin kutusuna tiklayin ve gecerli telefon numarasi girin
    And Email metin kutusuna tiklayin ve gecerli Email girin
    And IDGroup metin kutusunu tıklayın ve grup seçin
    And Save butonuna tiklayin