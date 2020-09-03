@rezlist
Feature: Login feature

  @Excel
  Scenario: TC01_Butun Room Rezervation List Excel olarak indirilebilir olmali
    Given kullanici fhctriplogin sayfasinda
    And kullanici gecerli username girer
    And kullanici gecerli password girer
    And kullanici login butonuna basar
    And kullanici Excel formatina basar
    Then kullanici indir butonuna basar

  @Csv
  Scenario: TC01_Butun Room Rezervation List Csv olarak indirilebilir olmali
    Given kullanici fhctriplogin sayfasinda
    And kullanici Csv formatina basar
    Then kullanici indir butonuna basar

  @Pdf
  Scenario: TC01_Butun Room Rezervation List Pdf olarak indirilebilir olmali
    Given kullanici fhctriplogin sayfasinda
    And kullanici Pdf formatina basar
    Then kullanici indir butonuna basar

  @Yazdir
  Scenario: TC01_Room Rzervation Yazdirma butonuna tikladigimda tum listeyi yazdirmali
    Given kullanici fhctriplogin sayfasinda
    Then kullanici yazdir butonuna basar