# Convert-to-Solr-Xml-Format-
Bu basit bir XmlParser projesidir.Amaç:
Apache-Solr'a istenen formatta Xml dosyası atabilmektir.
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

https://lucene.apache.org/solr/guide/8_2/uploading-data-with-index-handlers.html

Projeyi çalıştırınca solr dosyası dizininde(solr.install.dir/:) ->
$sudo bin/post -c core_name example/exampledocs/output.xml komutunu çalıştır.
> 1 files indexed.  
Yazısı görünecek.
