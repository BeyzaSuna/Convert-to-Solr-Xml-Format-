# Convert-to-Solr-Xml-Format-
Bu basit bir XmlParser projesi.Amaç:
Apache-Solr'a istenen formatta Xml dosyası atabilmek.
https://lucene.apache.org/solr/guide/8_2/uploading-data-with-index-handlers.html
Bu format şu şekilde:
``` xml
  <add>
    <doc>
      <field name="...">.....</field>
      <field name="...">.....</field>
      <field name="...">.....</field>
    </doc>
    <doc>
      <field name="...">.....</field>
      <field name="...">.....</field>
      <field name="...">.....</field>
    </doc>
  </add>

Elimde ornek.xml diye bir dosya var.Bu dosyayı Apache-Solr'a atabilmek için Xml'i Parse etmem gerekiyor.
Bunun için SAXParser kütüphanesini kullandım.Parse edilen xml'i output.xml dosyasına yazdırdım.


**ornek.xml dosyası**

``` xml
<?xml version="1.0" encoding="UTF-8"?>
    <kitaplık>
    <kitap>
        <id>1</id>
        <ad>Lacivert Safir</ad>
        <yazar> T.Y Mazer</yazar>
        <sayfa>428 sayfa</sayfa>
    </kitap>
    <kitap>
        <id>2</id>
        <ad>Oyunbozan</ad>
        <yazar>James Dashner</yazar>
        <sayfa>318 sayfa</sayfa>
    </kitap>
    <kitap>
        <id>3</id>
        <ad>Sherlock Holmes Akıl Oyunlarının Gölgesinde</ad>
        <yazar>Sir Arthur Conan Doyle</yazar>
        <sayfa>336 sayfa</sayfa>
    </kitap>
    <kitap>
        <id>4</id>
        <ad>Senin İçin Enginar Sakladım</ad>
        <yazar> Salim Nizam, Roman</yazar>
        <sayfa>471 sayfa</sayfa>
    </kitap>
    <kitap>
        <id>5</id>
        <ad>Kayıp Kızlar</ad>
        <yazar>Megan Miranda</yazar>
        <sayfa>460 sayfa</sayfa>
    </kitap>
    <kitap>
        <id>6</id>
        <ad>Aldanış</ad>
        <yazar>James Morgan</yazar>
        <sayfa>380 sayfa</sayfa>
    </kitap>
    </kitaplık>


**output.xml dosyası**

``` xml
<add>
<doc>
    <field name="id">1</field>
    <field name="ad">Lacivert Safir</field>
    <field name="yazar"> T.Y Mazer</field>
    <field name="sayfa">428 sayfa</field>
</doc>
<doc>
    <field name="id">2</field>
    <field name="ad">Oyunbozan</field>
    <field name="yazar">James Dashner</field>
    <field name="sayfa">318 sayfa</field>
</doc>
<doc>
    <field name="id">3</field>
    <field name="ad">Sherlock Holmes Akıl Oyunlarının Gölgesinde</field>
    <field name="yazar">Sir Arthur Conan Doyle</field>
    <field name="sayfa">336 sayfa</field>
</doc>
<doc>
    <field name="id">4</field>
    <field name="ad">Senin İçin Enginar Sakladım</field>
    <field name="yazar"> Salim Nizam, Roman</field>
    <field name="sayfa">471 sayfa</field>
</doc>
<doc>
    <field name="id">5</field>
    <field name="ad">Kayıp Kızlar</field>
    <field name="yazar">Megan Miranda</field>
    <field name="sayfa">460 sayfa</field>
</doc>
<doc>
    <field name="id">6</field>
    <field name="ad">Aldanış</field>
    <field name="yazar">James Morgan</field>
    <field name="sayfa">380 sayfa</field>
</doc>
</add>


Projeyi çalıştırınca solr dosyası dizininde(solr.install.dir/:) ->
**$sudo bin/post -c core_name example/exampledocs/output.xml** komutunu çalıştır.
> 1 files indexed.  
Yazısı görünecek.
