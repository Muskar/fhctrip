@hotelolusturma2
Feature: Hotel_Olusturma02
  Scenario: AC-02: Yönetici olarak zorunlu kutulardan birini bos biraktigimda otel bilgilerini kaydedememeliyim ve
  zorunlu kutunun cercevesini uyari mesaji ile kirmizi olarak görmeliyim
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
    And IDGroup metin kutusunu tıklayın ve grup seçin
    And Save butonuna tiklayin ve kayit mesajinin görüntülenmedigini dogrulayin