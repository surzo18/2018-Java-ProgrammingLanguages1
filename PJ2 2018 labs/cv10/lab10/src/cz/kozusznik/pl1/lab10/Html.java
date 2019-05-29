package cz.kozusznik.pl1.lab10;
/*******************************************************************************
 * Kožusznik Jan
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Html {

  private final String data;

  /**
   *
   */
  public Html() {
    data = getText();
  }

  @Override
  public String toString() {
    return data;
  }

  private int lenght(){
    return toString().length();
  }

  public int numA(){
    int cnt=0;
    for (int i = 0; i < lenght(); i++) {
      if (data.charAt(i)=='a') ++cnt;
    }
    return cnt;
  }
  public int numMalychSamohlasek(){
    int cnt=0;
    for (int i = 0; i < lenght(); i++) {
      if (data.charAt(i)=='a'||
          data.charAt(i)=='e'||
          data.charAt(i)=='i'||
          data.charAt(i)=='o'||
          data.charAt(i)=='u'||
          data.charAt(i)=='y') ++cnt;
    }
    return cnt;
  }


  public int numVelkychSamohlasek(){
    int cnt=0;
    for (int i = 0; i < lenght(); i++) {
      if (data.charAt(i)=='A'||
          data.charAt(i)=='E'||
          data.charAt(i)=='I'||
          data.charAt(i)=='O'||
          data.charAt(i)=='U'||
          data.charAt(i)=='Y') ++cnt;
    }
    return cnt;
  }
  public int numSamohlasek(){
    int cnt=0;
    for (int i = 0; i < lenght(); i++) {
      char tmp=data.charAt(i);
      tmp=Character.toLowerCase(tmp);
      if (tmp=='a'||
          tmp=='e'||
          tmp=='i'||
          tmp=='o'||
          tmp=='u'||
          tmp=='y') ++cnt;
    }
    return cnt;
  }
  public int numOfStarecMore() {
    int cnt = 0;
    int index = 0;
    String down = data.toLowerCase();
    //todo tohle je shit, ale tak nejak
    while (index != -1) {
      index = down.indexOf("starec", index + "starec".length());
      if (index == -1) {
        ++cnt;
      }
    }
    return cnt;
  }

  public int numOfWord(){
    String[] words = data.split("[\" ,.?!]+");
    //System.out.println("Total word count: " + words.length);
    /*
    String regex="href=\"http[s]?:\\/\\/\\s+[\"]";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher(data);
    int cnt=0;*/
    return words.length;
  }


  private String getText() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"")
        .append(
            " \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"cs\" lang=\"cs\">")
        .append(
            "<head profile=\"http://gmpg.org/xfn/11\"><meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8               \" /><meta http-equiv=\"content-language\" content=\"cs-CZ\" /><meta name=\"keywords\" content=\"456, informatika, VŠB, FEI, Ostrava, studium, vysoká škola, univerzita, katedra\" /><meta name=\"description\" content=\"Oficiální internetová prezentace Katedry informatiky, FEI, VŠB-TU Ostrava. Na těchto stránkách najdete informace o katedře, studiu, výzkumu, zaměstnancích, apod.\" /><title>VŠB  | Katedra informatiky FEI VŠB-TUO")
        .append(
            "               </title><meta name=\"author\" content=\"CMS: NetDirect MediaCentrik; Design, HTML, CSS: NetDirect Team; info@netdirect.cz\" /><link rel=\"Author\" title=\"NetDirect\" href=\"http://www.netdirect.cz\" /><link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/favicon.ico\" /><link rel=\"alternate\" type=\"application/rss+xml\" title=\"RSS katedra informatiky FEI VŠB\" href=\"/rsshandlerext.aspx?exportId=1&amp;dontparse=false\" /><style type=\"text/css\">")
        .append("           /* <![CDATA[ */")
        .append("           @import \"/_css/generic.css\";")
        .append("           /* ]]> */")
        .append("         </style><style type=\"text/css\">")
        .append("           /* <![CDATA[ */")
        .append("           @import \"/_css/linksicons.css\";")
        .append("           /* ]]> */")
        .append(
            "         </style><script type=\"text/javascript\" src=\"/_js/functions.js\"> </script><script type=\"text/javascript\" src=\"/_js/web456.js\"> </script><script type=\"text/javascript\">")
        .append("       function createCookie(value) {")
        .append(
            "       document.cookie = \"javascript=\"+value+\"; path=/\";             ")
        .append("       }")
        .append("     </script>")
        .append("</head>")
        .append("<body id=\"www-vsb-cz\">")
        .append("     ")
        .append("")
        .append("<ul id=\"accessibility\">")
        .append(
            " <li><a href=\"http://www.ippi.cz/klavesove-zkratky/\" accesskey=\"1\">Klávesové zkratky na tomto webu - rozšířené</a></li>")
        .append(
            " <li><a href=\"#content\" accesskey=\"0\">Přejít na obsah</a></li>")
        .append(" <li><a href=\"#aside\">Přejít na navigaci</a></li>")
        .append(" <li><a href=\"#srch\">Přejít na hledání</a></li>")
        .append("</ul>")
        .append("  <div id=\"site\">")
        .append("   ")
        .append("<div id=\"header\">")
        .append(" <form method=\"get\" action=\"/hledani/\">")
        .append("  <ul id=\"lang\">")
        .append(
            "   <li id=\"en\" title=\"Coming soon ...\">English<span><!-- --></span></li>")
        .append("   <li id=\"cz\">Česky<span><!-- --></span></li>")
        .append("  </ul>")
        .append("  <div id=\"search\">")
        .append(
            "   <input type=\"text\" id=\"srch\" name=\"allwords\" accesskey=\"4\" />")
        .append(
            "   <input type=\"hidden\" id=\"catid\" name=\"catid\" value=\"44\" />")
        .append(
            "   <input type=\"image\" name=\"search\" id=\"btn\" alt=\"Hledej\" src=\"/img/sbtn.gif\" />")
        .append("  </div>")
        .append(" </form>")
        .append("<hr />")
        .append(
            "<ul id=\"subnav\"><li class=\"nbg\">Hlavní stránka</li><li><a href=\"/intranet/intranet.aspx\">Intranet</a></li><li><a href=\"/katedra/lide-1/\">Lidé</a></li><li><a href=\"/mapa-webu/\" accesskey=\"3\">Mapa webu</a></li></ul>")
        .append("<hr />")
        .append(
            "<img src=\"/img/fei-logo.png\" alt=\"Katedra informatiky FEI VŠB-TUO [logo]\" id=\"logo\" /><img src=\"/img/fei-logo-txt.png\" alt=\"Katedra informatiky FEI VŠB-TUO [logo]\" id=\"logotext\" />")
        .append("<div id=\"iimg\">")
        .append("")
        .append(
            "<p><img height=\"161\" width=\"542\" alt=\"\" src=\"/Files/imp/header_cpu.jpg\" /></p>")
        .append("")
        .append("")
        .append("")
        .append("")
        .append("")
        .append("")
        .append("")
        .append("</div>")
        .append(" <ul id=\"vsbtuo\">")
        .append(
            "  <li id=\"fei\"><a href=\"http://www.fei.vsb.cz\" title=\"Fakulta elektrotechniky a informatiky, VŠB - TUO\">www.fei.vsb.cz<span><!-- --></span></a></li>")
        .append(
            "  <li id=\"vsb\"><a href=\"http://www.vsb.cz\" title=\"Vysoká škola báňská, Technická univerzita Ostrava\">www.vsb.cz<span><!-- --></span></a></li>")
        .append(" </ul>")
        .append("<hr />")
        .append(
            "<ul id=\"anav\"><li><a href=\"/katedra/\">KATEDRA</a></li><li class=\"sdt\"><a href=\"/studium/\">STUDIUM</a></li><li class=\"nbg\"><a href=\"/veda-a-vyzkum/\">VĚDA A VÝZKUM</a></li></ul>")
        .append("<hr />")
        .append("</div>")
        .append("   <div id=\"content\">")
        .append("    ")
        .append("<div id=\"home\">")
        .append(" <div id=\"news\">")
        .append("<div id=\"welcome\">")
        .append("  <div class=\"detail\">")
        .append("<!--p><style type=\"text/css\">")
        .append("@media screen")
        .append("{")
        .append(" html:not(:nth-child(1)) #news {")
        .append(" min-height: 56.2em !important;")
        .append(" height: auto !important;")
        .append(" }")
        .append("")
        .append(" #news:nth-child(0n+1) {")
        .append(" min-height: 58.4em !important;")
        .append(" height: auto !important;")
        .append(" }")
        .append("")
        .append("}</style></p>")
        .append(
            "<p style=\"padding-bottom: 20px; margin-top: -20px\"><img alt=\"\" src=\"/Files/general_files/pf2014.png\" /></p-->")
        .append("<h1>Aktuality</h1>")
        .append("</div>")
        .append("</div>")
        .append(
            "  <div class=\"articles\"><h3><a href=\"/katedra/aktuality/soutez-v-programovani-ctu-open-2014.aspx\">Soutěž v programování CTU Open 2014</a></h3><p><small>14. 10. 2014</small></p><p>Ve dnech 17.-18. října 2014 se bude na katedře informatiky konat soutěž v&nbsp;programování CTU Open 2014. Jedná se o&nbsp;česko-slovenské předkolo celosvětové soutěže v&nbsp;programování ACM International&hellip;</p></div><div class=\"articles\"><h3><a href=\"/katedra/aktuality/studentske-staze-v-ibm.aspx\">Studentské stáže v IBM</a></h3><p><small>20. 5. 2014</small></p><p>Rádi bychom Vás informovali o&nbsp;výběrovém řízení do stážového programu IBM Internship pro nadcházející letní běh.  </p></div><div class=\"articles\"><h3><a href=\"/katedra/aktuality/prednaska-novinky-v-online-marketingu.aspx\">Přednáška: Novinky v online marketingu</a></h3><p><small>23. 4. 2014</small></p><p>V pondělí 5.5.2014 ve 12.30 se můžete zúčastnit přednášky, která se zaměří na novinky v&nbsp;oblasti online marketingu. Přednášet bude Ing. Tomáš Nohál ze společnosti SEO Plus.</p></div><div class=\"articles\"><h3><a href=\"/katedra/aktuality/odpoledne-s-redhatem-1.aspx\">Odpoledne s RedHatem</a></h3><p><small>8. 4. 2014</small></p><p>Vážení studenti, rádi bychom Vás pozvali na odpolední setkání se společností RedHat.</p></div><div class=\"articles\"><h3><a href=\"/katedra/aktuality/bgp-pro-opravdove-sitare-2.aspx\">BGP pro opravdové síťaře 2</a></h3><p><small>8. 4. 2014</small></p><p>Další z&nbsp;pravidelných seminářů v&nbsp;rámci spolupráce s&nbsp;Cisco Academy při VŠB-TUO a&nbsp;společností Tieto.</p></div>")
        .append("  ")
        .append("  <div class=\"clr\"><!-- --></div>")
        .append(
            "  <a href=\"/katedra/aktuality/\" class=\"archive\">archív zpráv</a>")
        .append(" </div>")
        .append(" <div class=\"clr\"><!-- --></div>")
        .append(" <hr />")
        .append(" <div id=\"bside\">")
        .append("  <!--div class=\"bsidebox start\">")
        .append("   <div class=\"bsidebox-in\">")
        .append("    <div class=\"bsidebox-deep\">")
        .append("     <h4>KALENDÁŘ AKCÍ</h4>")
        .append("      <ul></ul>  ")
        .append(
            "      <div id=\"calbox\"><table><thead><tr><th><a href=\"/katedra/udalosti-a-akce/cal_m201409/lang_1/\"><img src=\"/img/arrow-l.gif\" alt=\"Předchozí měsíc\" /></a></th><th colspan=\"5\" class=\"month\"><a href=\"/katedra/udalosti-a-akce/cal_m201410/lang_1/\">říjen</a>, <a href=\"/katedra/udalosti-a-akce/cal_y2014/lang_1/\">2014</a></th><th><a href=\"/katedra/udalosti-a-akce/cal_m201411/lang_1/\"><img src=\"/img/arrow-r.gif\" alt=\"Následující měsíc\" /></a></th></tr><tr><th>po</th><th>út</th><th>st</th><th>čt</th><th>pá</th><th>so</th><th>ne</th></tr></thead><tbody><tr><td class=\"nbb\">29</td><td class=\"nbb\">30</td><td>1</td><td>2</td><td>3</td><td class=\"so\">4</td><td class=\"ne\">5</td></tr><tr><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td><td class=\"so\">11</td><td class=\"ne\">12</td></tr><tr><td>13</td><td>14</td><td>15</td><td>16</td><td>17</td><td class=\"so\">18</td><td class=\"ne\">19</td></tr><tr><td>20</td><td>21</td><td>22</td><td>23</td><td>24</td><td class=\"so\">25</td><td class=\"ne\">26</td></tr><tr><td>27</td><td>28</td><td>29</td><td class=\"ac\">30</td><td>31</td><td class=\"nbb\">1</td><td class=\"nbb\">2</td></tr></tbody></table></div>")
        .append("    </div>")
        .append("   </div>")
        .append("  </div-->")
        .append("  <div class=\"bsidebox in start\">")
        .append("   <div class=\"bsidebox-in\">")
        .append("    <div class=\"bsidebox-deep\">")
        .append(
            "     <h4>AKTUÁLNĚ</h4><ul><li><a class=\"nw\" target=\"_blank\" href=\"https://www.fei.vsb.cz/shared/uploadedfiles/webgen/Pruvodce_prvaka_na_FEI.pdf\"><b>Průvodce prváka na FEI&#160;</b></a></li><li>Harmonogramy: <a href=\"/studium/studenti/harmonogram/harmonogram-pro-bakalarske-studium.aspx\"><b>Bc.</b></a>, <a href=\"/studium/studenti/harmonogram/harmonogram-akademickeho-roku.aspx\"><b>Mgr.</b></a>, <a href=\"/studium/studenti/harmonogram/tutorialy-bakalarskeho-i-magisterskeho-kombinovaneho-studia.aspx\"><b>komb.</b></a></li><li><a href=\"/studium/studenti/magisterske-studium/kombinovane-studium/otevrene-predmety-pro-kombinovanou-formu-navazujiciho-studia.aspx\"><b>Předměty komb. (Mgr.)</b></a></li><li><b><a href=\"/studium/studenti/bakalarske-studium/kombinovane-studium/\">Rozvrhy komb. (Bc.)</a></b></li><li><b><a href=\"/studium/studenti/magisterske-studium/kombinovane-studium/\">Rozvrhy komb. (Mgr.)</a><br /></b><br /></li><li><a class=\"nw\" href=\"http://www.fei.vsb.cz/okruhy/studium-a-vyuka/organizace-vyuky/zapisy\"><b>Zápisy</b></a><br /><br /></li><li><b><a href=\"/studium/studenti/bakalarske-studium/dulezite-informace/\">Důležité informace (Bc.)</a></b></li><li><b><a href=\"/studium/studenti/magisterske-studium/dulezite-informace/\">Důležité informace (Mgr.)</a></b></li></ul>")
        .append("     ")
        .append("    </div>")
        .append("   </div>")
        .append("  </div>")
        .append("  <div class=\"bsidebox stop\">")
        .append("   <div class=\"bsidebox-in\">")
        .append("    <div class=\"bsidebox-deep\">")
        .append("       ")
        .append(
            "      <h4>PRÁCE &amp; PRAXE</h4><div class=\"articlelistbox\"><div class=\"articlelistbox\">")
        .append(
            "<div style=\"text-align: center\"><!--[if !IE]> --><object id=\"banner\" height=\"150\" width=\"180\" data=\"/Files/partneri/banner_ND_CS-VSB_prace4.swf?clicktrhu=http://www.netdirect.cz/cz/kariera/default.aspx\" type=\"application/x-shockwave-flash\"><!-- <![endif]--><!--[if IE]>")
        .append(
            "<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\"")
        .append(
            "  codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0\"")
        .append("  width=\"180\" height=\"200\">")
        .append(
            "  <param name=\"movie\" value=\"/Files/partneri/banner_ND_CS-VSB_prace5.swf?clicktrhu=http://www.netdirect.cz/cz/kariera/default.aspx\" />")
        .append("<!--><!--dgx-->")
        .append("<param value=\"true\" name=\"loop\" />")
        .append("<param value=\"false\" name=\"menu\" />")
        .append("<param value=\"high\" name=\"quality\" />")
        .append("<param value=\"#003745\" name=\"bgcolor\" />")
        .append("<p>NetDirect Banner</p>")
        .append("</object><!-- <![endif]--></div>")
        .append(
            "<div style=\"text-align: right\"><a class=\"archive\" href=\"/studium/nabidky-prace-a-praxe/\">další nabídky</a></div>")
        .append("</div></div> ")
        .append("    </div>")
        .append("   </div>")
        .append("  </div>")
        .append(" </div>")
        .append("<div class=\"clr\"></div>")
        .append("         <hr />")
        .append("         <div id=\"homeinfo\">")
        .append(
            "  <p><img border=\"0\" alt=\"\" width=\"360\" height=\"134\" usemap=\"#partneri_map\" src=\"/Files/partneri/partneri.png\" /> <map name=\"partneri_map\">")
        .append(
            "<area shape=\"rect\" alt=\"Cisco Net Academy\" target=\"_blank\" coords=\"14,45,62,93\" href=\"http://rcna.vsb.cz/\" />")
        .append(
            "<area shape=\"rect\" alt=\"Tieto CZ\" target=\"_blank\" coords=\"77,44,130,94\" href=\"http://www.tieto.cz\" />")
        .append(
            "<area shape=\"rect\" alt=\"NetDirect\" target=\"_blank\" coords=\"141,46,231,91\" href=\"http://www.netdirect.cz\" />")
        .append(
            "<area shape=\"rect\" alt=\"Microsoft CZ\" target=\"_blank\" coords=\"246,14,353,55\" href=\"http://www.microsoft.cz\" />")
        .append(
            "<area shape=\"rect\" alt=\"u&amp;sluno\" target=\"_blank\" coords=\"248,80,354,120\" href=\"http://www.u-sluno.cz\" /></map></p>")
        .append(
            "  <dl><dt><a href=\"http://www.zive.cz/bleskovky/microsoft-predstavil-chytry-naramek-meri-i-informuje/sc-4-a-175962/default.aspx#utm_medium=selfpromo&amp;utm_source=zive&amp;utm_campaign=RSSfeed\">Microsoft představil chytrý náramek, měří i informuje</a></dt><dd> Microsoft ukázal Band, chytrý náramek, který bude zaznamenávat aktivity&hellip;<b> [zive.cz]</b></dd></dl>")
        .append(
            "  <dl><dt><a href=\"http://technet.idnes.cz/stratocaching-2014-0kq-/online.aspx?online=1005633#utm_source=rss&amp;utm_medium=feed&amp;utm_campaign=technet&amp;utm_content=main\">ON-LINE: Bitva u Lipan. To tu ještě nebylo, semínko se podařilo chytit za letu</a></dt><dd>Experiment Stratocaching je letos u konce. Dropion i semínka jsou na zemi.&hellip;<b> [technet.cz]</b></dd></dl>")
        .append("           <div class=\"clr\"><!-- --></div>")
        .append("         </div><!-- homeinfo -->")
        .append("         <div class=\"clr\"><!-- --></div>")
        .append("</div>")
        .append("")
        .append("    ")
        .append("<hr />")
        .append("<div id=\"aside\">")
        .append(" ")
        .append(" <ul>")
        .append(
            "    <li class=\"nbg\"><a href=\"/katedra/o-katedre/\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> O&#160;katedře</a></li>")
        .append(
            "    <li><a href=\"/katedra/kontakt/\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Kontakt</a></li>")
        .append(
            "    <li><a href=\"/katedra/lide-1/\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Lidé</a></li>")
        .append(
            "    <li><a href=\"/veda-a-vyzkum/vyzkumne-skupiny/vedecko-vyzkumne-skupiny.aspx\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Výzkumné skupiny</a></li>")
        .append(
            "    <li><a href=\"/katedra/partneri-katedry/\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Partneři katedry</a></li>")
        .append(
            "    <li class=\"end\"><a href=\"/katedra/odkazy/\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Odkazy</a>&#160;<br />")
        .append("    </li>")
        .append("</ul>")
        .append("<ul>")
        .append(
            "    <li class=\"nbg\"><a class=\"nw\" target=\"_blank\" href=\"http://edison.vsb.cz\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> EDISON</a></li>")
        .append(
            "    <li><a class=\"nw\" target=\"_blank\" href=\"http://moodle.cs.vsb.cz\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Moodle</a></li>")
        .append(
            "    <li class=\"end\"><a class=\"nw\" target=\"_blank\" href=\"http://barborka.vsb.cz\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Barborka</a></li>")
        .append("</ul>")
        .append("<p><br />")
        .append("</p>")
        .append("<ul>")
        .append(
            "    <li class=\"nbg\"><a class=\"nw\" title=\"Studium v&#160;Ostravě na FEI, VŠB-TU Ostrava\" target=\"_blank\" href=\"http://www.studujvostrave.cz\"><img class=\"nav10\" alt=\"\" src=\"/img/pix.gif\" /> Studuj v&#160;Ostravě!!!</a></li>")
        .append("</ul>")
        .append("<p>&#160;</p>")
        .append(" ")
        .append("</div>")
        .append("")
        .append("    ")
        .append("<div class=\"clr\"><!-- --></div>")
        .append("<hr />")
        .append("<div id=\"footer\">")
        .append(
            " <p><a href=\"/rss\" class=\"rss\" title=\"RSS kanál\"><img src=\"/img/feed.png\" alt=\"RSS\" /></a><a href=\"#\" OnClick=\"javascript:AddFavoriteCZ(this, 'http://www.cs.vsb.cz','Katedra Informatiky, FEI, VŠB-TUO');\" class=\"rss\" title=\"Přidat do oblíbených\"><img src=\"/img/star.png\" alt=\"Favorites\" /></a>")
        .append("")
        .append(
            "<a class=\"a2a_dd rss\" href=\"http://www.addtoany.com/share_save?linkname=Katedra%20informatiky%20FEI%20V%C5%A0B-TUO&amp;linkurl=http%3A%2F%2Fwww.cs.vsb.cz\"><img src=\"http://static.addtoany.com/buttons/favicon.png\" width=\"16\" height=\"16\" border=\"0\" alt=\"Share/Bookmark\"/></a><script type=\"text/javascript\">a2a_linkname=\"Katedra informatiky FEI VŠB-TUO\";a2a_linkurl=\"http://www.cs.vsb.cz\";</script><script type=\"text/javascript\" src=\"http://static.addtoany.com/menu/page.js\"></script>")
        .append("")
        .append("<!--[if IE]> ")
        .append(
            "<a href=\"#\" class=\"rss\" onclick=\"this.style.behavior='url(#default#homepage)'; this.setHomePage('http://www.cs.vsb.cz'); return false;\" title=\"Nastavit stránku jako domácí\"><img src=\"/img/house.png\" alt=\"Homepage\" /></a>")
        .append("<![endif]-->")
        .append("  &copy; Katedra informatiky FEI VŠB-TUO. ")
        .append(
            "Využíváme <a href=\"http://www.mediacentrik.cz/cz/slovnik/art_193/redakcni-system.aspx\" title=\"Redakční systém - Mediacentrik\">redakční systém</a>&nbsp;<a href=\"http://www.netdirect.cz/\" title=\"NetDirect s.r.o.\">NetDirect</a>&nbsp;<a href=\"http://www.mediacentrik.cz/\" title=\"MediaCentrik - tvorba www stránek\">MediaCentrik</a><sup>&reg;</sup>")
        .append("</p>")
        .append("</div>")
        .append("   </div>")
        .append("  </div>")
        .append("")
        .append("<script type=\"text/javascript\">")
        .append(
            "var gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");")
        .append(
            "document.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));")
        .append("</script>").append("<script type=\"text/javascript\">")
        .append("try {")
        .append("var pageTracker = _gat._getTracker(\"UA-5018034-1\");")
        .append("pageTracker._setVar(getSilverlightVersion()); ")
        .append("pageTracker._trackPageview();")
        .append("} catch(err) {}</script>").append(" </body>")
        .append("</html>");
    return sb.toString();
  }
}
