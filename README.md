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

Elimde ornek.xml diye bir dosya var.Bu dosyayı Apache-Solr'a atabilmek için Xml'i Parse etmem gerekiyor. Bunun için SAXParser kütüphanesini kullandım.Parse edilen xml'i output.xml dosyasına yazdırdım.

Projeyi çalıştırınca solr dosyası dizininde(solr.install.dir/:) ->
$sudo bin/post -c core_name example/exampledocs/output.xml komutunu çalıştır.
> 1 files indexed.  
Yazısı görünecek.
