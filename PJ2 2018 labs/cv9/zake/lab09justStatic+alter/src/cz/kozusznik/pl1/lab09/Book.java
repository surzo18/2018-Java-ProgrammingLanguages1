/*******************************************************************************
 * Kožusznik Jan
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

package cz.kozusznik.pl1.lab09;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Book {
  private final String data;

  /**
   *
   */
  public Book() {
    data = getText();
  }

  @Override
  public String toString() {
    return data;
  }

  public Collection<String> getWords() {
    return Arrays.asList(toString().split("[\" :,.?!\n]+"));
  }

  private String getText() {
    StringBuilder sb = new StringBuilder();
    sb.append("Ernest Hemingway - Stařec a moře\n").append("\n")
        .append(
            "Byl už starý, vyjížděl sám v loďce na lov do Golfského proudu a teď tomu bylo čtyřiaosmdesát dní, co nechytil jedinou rybu. Prvních čtyřicet dní s ním jezdil chlapec. Ale po čtyřiceti dnech bez úlovku řekli chlapci jeho rodiče, že starý je už dočista a nadobro salao, což je nejhorší druh smolaře, a chlapec začal na jejich příkaz jezdit s jiným člunem, který ulovil tři pořádné ryby hned první týden. Chlapec byl smutný, když viděl, jak se starý každý den vrací s prázdnou loďkou, a vždycky mu šel pomoci odnést buď kotouče šňůry nebo hák s bodcem a harpunu a plachtu skasanou kolem stěžně. Plachta byla záplatována pytli od mouky a svinuta vyhlížela jako vlajka trvalé porážky.\n")
        .append(
            "Stařec byl hubený, vyzáblý a zátylek měl zrytý hlubokými rýhami. Na lících mu vyvstaly hnědé skvrny kůže, zrohovatělé na ochranu před odrazem slunce v tropickém moři. Ty skvrny mu sahaly po stranách obličeje až dolů a ruce měl zjizvené hlubokými zářezy od toho, jak se lopotil s těžkými rybami na šňůrách. Žádná z těch jizev však nebyla čerstvá. Byly tak staré jako výmoly v bezrybé poušti.\n")
        .append(
            "Všechno na něm bylo staré, až na jeho oči. Ty měly stejnou barvu jako moře a hleděly vesele a nezkrušeně.\n")
        .append(
            "\"Santiago,\" řekl mu chlapec, když šplhali na břeh, kam pak vytahovali loďku. \"Mohl bych jezdit zase s vámi. Vydělali jsme nějaké peníze.\"\n")
        .append("Stařec kdysi naučil chlapce rybařit a chlapec ho miloval.\n")
        .append(
            "\"Ne,\" odpověděl stařec. \"Jsi na šťastném člunu. Zůstaň s nimi!\"\n")
        .append(
            "\"Ale vzpomeňte si, jak jste jednou nezavadil o rybu sedmaosmdesát dní a pak jsme tři neděle chytali kapitální kusy den co den!\"\n")
        .append(
            "\"Vzpomínám,\" přisvědčil stařec. \"Já vím, že jsi ode mne neodešel proto, že bys pochyboval.\"\n")
        .append(
            "\"To mi poručil táta. Jsem ještě kluk a musím ho poslouchat.\"\n")
        .append("\"Já vím,\" odpověděl stařec. \"To je docela přirozené.\"\n")
        .append("\"Nemá zrovna moc víry.\"\n")
        .append("\"Nemá,\" řekl stařec. \"Ale my máme. Vid?\"\n")
        .append(
            "\"Máme,\" potvrdil chlapec. \"Můžu vás pozvat na Terasu na pivo? Pak odneseme věci domů.\"\n")
        .append("\"Proč ne?\" souhlasil stařec. \"Jako rybář rybáře.\"\n")
        .append(
            "Seděli na Terase a mnoho rybářů si dělalo ze starce legraci a on se nezlobil. Jiní, z těch starších, se na něho dívali a bylo jim smutno. Ale nedávali to najevo a hovořili zdvořile o proudu, o tom, v jaké hloubce za sebou dnes vláčeli šňůry, o stále pěkném počasí a o tom, co viděli. Rybáři, kteří měli toho dne štěstí, byli už zpátky, vyvrhli své martiny a odnesli je naložené v celé délce napříč přes dvě prkna, klopýtajíce dva a dva na koncích obou prken do rybárny, kde čekali na nákladní auto s ledem, aby je odvezlo na trh do Havany. Ti, kdo chytili žraloky, dopravili je do továrny na jejich zpracování naproti přes zátoku, kde je vyzdvihli na kladkostrojích, vyřízli jim játra, odřezali ploutve, stáhli kůži a jejich maso rozkrájeli na pruhy k nasolení.\n")
        .append(
            "Když vál vítr z východu, přinášel přes přístavní zátoku zápach žraloci továrny, ale dnes bylo cítit jen slabounké závany, protože se vítr stočil k jihu a pak utichl a na Terase bylo příjemně a slunečno.\n")
        .append("\"Santiago,\" ozval se chlapec.\n")
        .append(
            "\"Copak?\" odpověděl stařec. Držel v ruce sklenici a myslel na dobu před mnoha lety.\n")
        .append("\"Můžu vám jet opatřit na zítra sardinky?\"\n")
        .append(
            "\"Ne. Běž si zahrát baseball. Veslovat ještě dokážu a Rogelio rozhodí síť.\"\n")
        .append(
            "\"Jel bych rád. Když s vámi nemůžu lovit, chtěl bych vám aspoň nějak po sloužit.\"\n")
        .append(
            "\"Pozval jsi mě na pivo,\" řekl mu stařec. \"Jsi už hotový mužský.\" \"Kolik mi bylo, když jste mě po prvé vzal do člunu?\"\n")
        .append(
            "\"Pět, a málem jsi přišel o život, když jsem vytáhl rybu ještě moc živou a ona nám málem rozmlátila člun na maděru. Pamatuješ?\"\n")
        .append(
            "\"Pamatuju se, jak plácala a tloukla ocasem a jak praskla lavička u vesel, a na ty rány, když jste do ní bušil. Pamatuju se, jak jste mě hodil na příď na stočené mokré šňůry, jak se celý člun třásl, a na ty rány, když jste do ní bušil, jako když se poráží strom, a jak jsem byl celý od krve, která tak sladce páchla.\"\n")
        .append(
            "\"Opravdu si to pamatuješ, nebo jsem ti to jenom vyprávěl?\"\n")
        .append(
            "\"Pamatuju si všechno od té doby, co jsme spolu byli po prvé.\"\n")
        .append(
            "Stařec se na něho podíval očima zanícenýma od slunce, důvěřivýma a láskyplnýma.\n")
        .append(
            "\"Kdybys byl můj, vzal bych tě s sebou a vsadil bych všechno na jednu kartu,\" řekl mu. \"Ale jsi tátův a mámin a jezdíš se šťastným člunem.\"\n")
        .append(
            "\"Smím sehnat ty sardinky? Vím taky, kde opatřit čtyři návnady.\"\n")
        .append(
            "\"Mně zbyly ještě dnešní. Dal jsem je do bedničky se solí.\"\n")
        .append("\"Nechtě mě, seženu vám čtyři čerstvé!\"\n")
        .append(
            "\"Jednu,\" namítl stařec. Nikdy neztratil naději a víru. Teď však v něm ožívaly, jako když se zvedá svěží vánek.\n")
        .append("\"Dvě,\" smlouval chlapec.\n")
        .append("\"Tak dvě,\" souhlasil stařec. \"Ale neukradl jsi je?\"\n")
        .append(
            "\"Ukradl bych je,\" přiznal chlapec. \"Ale tyhle jsem koupil.\"\n")
        .append(
            "\"Děkuji ti,\" řekl mu stařec. Byl příliš prostý na to, aby uvažoval, kdy dospěl k pokoře. Ale věděl, že k ní dospěl, a věděl, že pokora není člověku k necti a není na újmu opravdové hrdosti.\n")
        .append("\"Při tomhle proudu to zítra půjde dobře,\" poznamenal.\n")
        .append("\"Kam pojedete?\" zeptal se ho chlapec.\n")
        .append(
            "\"Daleko do moře, abych se vrátil, až se změní vítr. Chci vyrazit před svítáním.\"\n")
        .append(
            "\"Pokusím se ho přimět, aby vyplul taky dál,\" řekl chlapec. \"To bychom vám mohli přijít na pomoc, kdyby vám zabralo něco opravdu velikého.\"\n")
        .append("\"Ten loví nerad moc daleko od břehu.\"\n")
        .append(
            "\"To je pravda,\" připustil chlapec. \"Ale já jako uvidím něco, kam on nedohlídne, třeba nějakého ptáka na číhané, a přiměju ho, aby vyplul dál chytit nějakou dorádu.\"\n")
        .append("\"To má tak špatné oči?\"\n").append("\"Je skoro slepý.\"\n")
        .append(
            "\"To je divné,\" zamyslel se stařec. \"Nikdy nelovil želvy. To je na oči mor.\"\n")
        .append(
            "\"Ale vy jste u Moskytího pobřeží lovil želvy celá léta a máte oči dobré.\"\n")
        .append("\"Já jsem vůbec divný staroch.\"\n")
        .append("\"Ale jste teď dost silný na opravdu velkou rybu?\"\n")
        .append("\"Myslím, že jsem. A pak znám spoustu triků.\"\n")
        .append(
            "\"Odneseme věci domů,\" řekl chlapec. \"Abych mohl vzít síť a vypravit se na ty sardinku.\"\n")
        .append(
            "Sebrali z člunu výstroj. Stařec nesl přes rameno stěžeň a chlapec nesl bednu se stočenými tvrdými pletenci hnědých šňůr, bodec s hákem a harpunu s násadou. Bednička s návnadou ležela na zádi loďky vedle kyje, jehož se užívalo ke zdolání velkých ryb, když byly přitaženy po bok člunu. Nikdo by byl starému nic neukradl, ale bylo lépe vzít plachtu a tlusté šňůry domů, protože jim škodila rosa a protože, i když by mu místní lidé docela jistě nic neukradli, stařec měl za to, že bodec a harpuna ponechané ve člunu by jen zbytečně někoho pokoušely.\n")
        .append(
            "Kráčeli spolu po silnici k starcově chatrči a vešli otevřenými dveřmi. Starý opřel stěžeň se svinutou plachtou o stěnu a chlapec složil bednu a ostatní nářadí vedle na zem. Stěžeň byl skoro tak dlouhý jako jediná jizba v chatrči. Chatrč byla postavena z tuhých listenů, jež chrání pupeny královské palmy a kterým se říká guano, a byla v ní postel, stůl, jedna židle a ohniště na hlinité podlaze, kde se vařilo na dřevěném uhlí. Na hnědých stěnách z překrývajících se listů houževnatě vláknitého guana visel barvotiskNejsvětějšího srdce Ježíšova a ještě jeden obrázek Panenky Marie Cobreské. To byly památky po jeho ženě. Kdysi na stěně visívala její tónovaná fotografie, ale sundal ji, protože si při pohledu na ni připadal příliš osamělý, a teď ležela na polici v koutě pod jeho čistou košilí.\n")
        .append("\"Co máte k jídlu?\" zeptal se chlapec.\n")
        .append("\"Hrnec žluté rýže s rybou. Chceš trochu?\"\n")
        .append("\"Ne. Najím se doma. Mám vám rozdělat oheň?\"\n")
        .append("\"Ne. Rozdělám si ho později. Nebo tu rýži sním studenou.\"\n")
        .append("\"Smím si vzít síť?\"\n").append("\"Samozřejmě.\"\n")
        .append(
            "Ve skutečnosti tu žádná síť nebyla a chlapec si pamatoval, kdy ji prodali. Ale hráli tuhle smyšlenou hru každý den. Neexistoval ani hrnec žluté rýže s rybou a to chlapec věděl taky.\n")
        .append(
            "\"Pětaosmdesát je šťastné číslo,\" řekl stařec. \"Co bys tak říkal tomu, kdybych se vrátil s kusem, který by vydal přes tři metráky?\"\n")
        .append(
            "\"Vezmu si síť a půjdu na sardinky. Sednete si na slunce na zápraží?\"\n")
        .append(
            "\"Sednu. Mám tu včerejší noviny a přečtu si, jak dopadl baseball.\"\n")
        .append(
            "Chlapec nevěděl, jestli ty včerejší noviny nejsou taky smyšlené. Ale stařec je vytáhl zpod postele.\n")
        .append(
            "\"Perico mi je dal v hospodě,\" vysvětlil chlapci. \"Vrátím se, až seženu sardinky. Nechám vaše se svými u ledu a ráno se o ně můžeme rozdělit. Povíte mi pak o baseballu, až se vrátím.\"\n")
        .append("\"Yankeeové nemůžou prohrát.\"\n")
        .append("\"Jenže já mám strach z clevelandských Indiánů.\"\n")
        .append(
            "\"Věř na Yankeee, synku! Mají přece v mužstvu slavného DiMaggia.\"\n")
        .append(
            "\"Mám strach z detroitských Tygrů a z clevelandských Indiánů.\"\n")
        .append(
            "\"Dej si pozor, nebo se začneš bát i Rudochů z Cincinnati nebo Běloponožkářůz Chicaga!\"\n")
        .append(
            "\"Vy to už prostudujete a řeknete mi, až se vrátím.\" \"Neměli bychom si na pětaosmdesátku vsadit do posledního kola loterie? Zítra to bude pětaosmdesát dní.\"\n")
        .append(
            "\"To bychom mohli,\" odpověděl chlapec. \"Ale co spíš na sedmaosmdesátku? To byl váš největší rekord.\"\n")
        .append(
            "\"Dvakrát se to nestane. Myslíš, že seženeš nějakou pětaosmdesátku?\"\n")
        .append("\"Můžu si ji zamluvit.\"\n")
        .append(
            "\"Jeden aršík. To je dva a půl dolaru. Od koho bychom si to vypůjčili?\"\n")
        .append(
            "\"To nic není. Dva a půl dolaru si vždycky někde vypůjčím.\"\n")
        .append(
            "\"Myslím, že bych to taky dokázal. Ale nepokouším se o to. Člověk si začne půjčovat a skončí žebrotou.\"\n")
        .append(
            "\"Držte se v teple, dědo,\" řekl chlapec. \"Pamatujte, že máme září!\"\n")
        .append(
            "\"Měsíc, kdy táhnou velké ryby,\" odpověděl stařec. \"V máji dokáže rybařit každý.\"\n")
        .append("\"Půjdu na ty sardinky,\" řekl chlapec.\n")
        .append(
            "Když se chlapec vrátil, stařec spal na židli a slunce už zapadlo. Chlapec stáhl s postele starou vojenskou pokrývku a přehodil ji přes opěradlo židle a starci přes ramena. Byla to zvláštní ramena, dosud mocná, třebaže velice stará. I jeho šíje byla dosud statná a rýhy nebyly tak vidět, když stařec spal a hlava mu padala dopředu. Košili měl tolikrát záplatovanou, že byla jako jeho plachta, a záplaty vyrudly sluncem do mnoha různých odstínů. Starcova hlava však byla velice stará, a když měl zavřené oči, byla jeho tvář bez života. Noviny mu ležely na kolenou a tíha jeho paže je tam přidržovala ve večerním větříku. Byl bos.\n")
        .append(
            "Chlapec ho tak nechal, a když přišel znovu, stařec spal ještě.\n")
        .append(
            "\"Probuďte se, dědo!\" promluvil na něho chlapec a položil mu ruku na koleno.\n")
        .append(
            "Stařec otevřel oči a chvíli se vracel z nějaké daleké, dálné cesty. Pak se usmál.\n")
        .append("\"Co je?\" zeptal se.\n")
        .append("\"Večeře,\" oznámil chlapec. \"Navečeříme se.\"\n")
        .append("\"Nemám zrovna hlad.\"\n")
        .append("\"Pojďte a najezte se! To nejde, rybařit a nejíst.\"\n")
        .append(
            "\"Dělávám to,\" řekl stařec vstávaje, sebral noviny a složil je. Pak začal skládat pokrývku.\n")
        .append(
            "\"Nechtě si tu pokrývku kolem sebe!\" napomenul ho chlapec. \"Nebudete rybařit bez jídla, co já budu živ.\"\n")
        .append(
            "\"Tak žij hodně dlouho a dávej na sebe pozor!\" odpověděl mu stařec. \"Co budeme jíst?\"\n")
        .append(
            "\"Černé fazole s rýží, pečené banány a trochu dušeného masa.\"\n")
        .append(
            "Chlapec přinesl večeři v kovovém šálku o dvou miskách z Terasy. Dva příbory, nože a vidličky a lžíce, měl v kapse, každý příbor zabalená do papírového ubrousku.\n")
        .append("\"Kdo ti to dal?\"\n").append("\"Martin. Hostinský.\"\n")
        .append("\"Musím mu poděkovat.\"\n")
        .append(
            "\"Už jsem mu poděkoval,\" řekl chlapec. \"Vy už mu děkovat nemusíte.\"\n")
        .append(
            "\"Dám mu maso z břicha příští velké ryby,\" prohlásil stařec. \"Udělal tohle pro nás už častěji?\"\n")
        .append("\"Tak se mi zdá.\"\n")
        .append(
            "\"To mu musím dát něco víc než maso z břicha. Je od něho moc hezké, že tak na nás myslí.\"\n")
        .append("\"Posílá dvě piva.\"\n")
        .append("\"Já mám nejradši pivo v plechovkách.\"\n")
        .append(
            "\"Já vím. Ale tohle je lahvové. Odnesu mu pak láhve zpátky.\"\n")
        .append("\"To jsi hodný,\" řekl stařec. \"Dáme se do jídla?\"\n")
        .append(
            "\"O to vám právě říkám,\" odpověděl mu chlapec jemně. \"Nechtěl jsem ty misky otvírat, dokud nebudete hotov.\"\n")
        .append(
            "\"Už jsem,\" pospíšil si stařec. \"Potřeboval jsem jen chvilku na umytí.\"\n")
        .append(
            "Kde se umyl? pomyslel si chlapec. Pumpa byla ve vesnici o dvě ulice dál dolů po silnici. Musím tu pro něho mít vodu, umiňoval si chlapec v duchu, a mýdlo a pořádný ručník. Proč na nic nemyslím? Musím mu opatřit ještě jednu košili a kazajku na zimu a nějaké boty a ještě jednu pokrývku.\n")
        .append("\"To dušené maso je výborné,\" pochválil ho stařec.\n")
        .append(
            "\"Povězte mi, jak to vypadá s baseballem,\" požádal chlapec.\n")
        .append(
            "\"V Americké lize není nad Yankeeje, jak jsem říkal,\" odpověděl stařec blaženě.\n")
        .append("\"Dneska prohráli,\" namítl mu chlapec.\"\n")
        .append("\"To nic neznamená. Slavný DiMaggio se zase našel.\"\n")
        .append("\"Mají v mužstvu taky jiné hráče.\"\n")
        .append(
            "\"Samozřejmě. Ale na něm nejvíc záleží. Ve druhé lize mezi Brooklynem a Filadelfií musím sázet na Brooklyn. Ale pak si zase vzpomenu na Dicka Sislera a na ty jeho ohromné drajvy ve starém parku.\"\n")
        .append(
            "\"To ještě nikdo jiný nedokázal. Napaloval míč nejdál, jak jsem kdy viděl.\"\n")
        .append(
            "\"Pamatuješ se, jak chodíval na Terasu? Chtěl jsem ho vzít na ryby, ale styděl jsem se mu říct. Tak jsem ti říkal, abys mu řekl ty, a ty jsi se styděl taky.\"\n")
        .append(
            "\"Já vím. To byla velká chyba. Byl by možná s námi jel. A my bychom pak měli vzpomínku na celý život.\" \"Rád bych vzal na ryby slavného DiMaggia,\" zamyslel se stařec. \"Jeho táta prý byl rybář. Možná, že byl tak chudý jako my a že by nám rozuměl.\"\n")
        .append(
            "\"Táta slavného Sislera nikdy nebyl chudý a hrál v první lize, když byl tak starý jako já.\"\n")
        .append(
            "\"Když jsem já byl tak starý jako ty, sloužil jsem jako námořník na plachetnici, co plula do Afriky, a viděl jsem večer na pobřeží lvy.\"\n")
        .append("\"Já vím. To jste mi vyprávěl.\"\n")
        .append("\"Chceš si povídat o Africe nebo o baseballu?\"\n")
        .append(
            "\"Radši o baseballu,\" odpověděl chlapec. \"Povězte mi o slavném Johnovi J. McGrawovi!\" Vyslovil J po Španělsku jako cín.\n")
        .append(
            "\"Chodíval kdysi taky občas na Terasu. Ale když se napil, byl hrubý, mluvil sprostě a nedalo se s ním vyjít. Měl v hlavě vedle baseballu ještě koně. Nosil aspoň pořád po kapsách dostihové seznamy a často říkával jména koní do telefonu.\"\n")
        .append(
            "\"Byl to slavný manažér,\" přidal se chlapec. \"Můj táta myslí, že ten něj slavnější.\"\n")
        .append(
            "\"To proto, že sem tak často jezdil,\" namítl stařec. \"Kdyby sem byl nepřestal jezdit každý rok Durocher, myslel by si tvůj táta, že nejslavnější manažér je on.\"\n")
        .append(
            "\"Ale kdo je opravdu nejslavnější manažér, Luque nebo Mike Gonzalez?\"\n")
        .append("\"Já myslím, že jsou tak stejní.\"\n")
        .append("\"A nejlepší rybář jste vy.\"\n")
        .append("\"Ba ne. Znám lepší.\"\n")
        .append(
            "\" Qué va,\" odporoval chlapec. \"Je hodně dobrých rybářů a pár jich je ohromných. Ale vy jste jen jeden.\"\n")
        .append(
            "\"Děkuju ti. To mi dělá dobře. Jen doufám, že se nenajde tak ohromná ryba, aby nás usvědčila z nepravdy.\"\n")
        .append(
            "\"Taková ryba není, jestli máte pořád ještě dost síly, jak říkáte.\"\n")
        .append(
            "\"Možná, že nejsem tak silný, jak si myslím,\" uvažoval stařec. \"Ale znám spoustu všelijakých triků a mám pevnou vůli.\"\n")
        .append(
            "\"Měl byste si teď jít lehnout, abyste byl ráno svěží. Odnesu nádobí zpátky na Terasu.\"\n")
        .append("\"Tak dobrou noc. Ráno tě vzbudím.\"\n")
        .append("\"Vy jste můj budíček,\" řekl mu chlapec.\n")
        .append(
            "\"Stáří je můj budíček,\" odpověděl mu stařec. \"Proč se staří lidé probouzejí tak brzy? Proto, aby si prodloužili další den života?\"\n")
        .append(
            "\"To nevím,\" poznamenal chlapec. \"Vím jen, že mladí chlapci spí dlouho a tvrdě.\"\n")
        .append(
            "\"Nezapomenu na to,\" uklidnil ho stařec. \"Vzbudím tě včas.\"\n")
        .append(
            "\"Nemám rád, když mě budí on. Připadám si, jako bych byl malé dítě.\"\n")
        .append("\"Já vím.\"\n").append("\"Vyspěte se dobře, dědo!\"\n")
        .append(
            "Chlapec odešel. Najedli se před chvílí u stolu beze světla a stařec si potmě svlekl kalhoty a vlezl si do postele. Stočil si kalhoty, aby si z nich udělal polštář, a dovnitř nastrkal noviny. Zavinul se do pokrývky a spal na jiných starých novinách nastlaných přes péra postele.\n")
        .append(
            "Usnul ve chvilce a zdálo se mu o Africe, kde byl jako chlapec, o dlouhých zlatých pobřežích a o bílých pobřežích, tak bílých, až z nich bolely oči, o vysokých mysech a mohutných hnědých horách. Plavil se teď podél těch břehů každou noc a slyšel ve snách řev příboje a viděl, jak se tím příbojem blíží čluny domorodců. Cítil ve spánku dehet a koudel ve spárách paluby a cítil vůně Afriky, které z jitra přinášel větřík z pevniny.\n")
        .append(
            "Když ucítil větřík z pevniny, probouzel se zpravidla a oblékal se, aby šel vzbudit chlapce. Ale dnes přišla vůně větříku z pevniny velice záhy a stařec věděl, že je ještě příliš brzy v jeho snu, a pokračoval v snění, aby uviděl, jak se bílé vrcholky Ostrovů vynořují z moře, a pak snil o různých přístavištích a kotvištích na Kanárském souostroví.\n")
        .append(
            "Už se mu nezdávalo o bouřích, ani o ženách, ani o významných událostech, ani o velikých rybách, ani o zápasech, ani o siláckých soutěžích, ani o vlastní ženě. Zdálo se mu teď jenom o různých místech a o lvech na pobřeží. Hráli si v soumraku jako koťata a on je miloval právě tak, jako miloval chlapce. O chlapci se mu nezdálo nikdy. Probral se jakoby nic, podíval se otevřenými dveřmi na měsíc, rozbalil si kalhoty a oblekl si je. Za chatrčí se vymočil a pak vykročil po silnici, aby vzbudil chlapce. Třásl se jitřním chladem. Ale věděl, že se tou třasavkou zahřeje a že zanedlouho bude veslovat.\n")
        .append(
            "Dveře domku, kde bydlel chlapec, nebyly zamčeny. Stařec je otevřel a vešel potichu bosýma nohama dovnitř. Chlapec spal na kavalci v první místnosti a stařec ho jasně rozeznal ve světle blednoucího měsíce. Uchopil ho jemně za jednu nohu a držel ho, dokud chlapec neprocitl, neotočil se a nepohlédl na něho. Stařec přikývl a chlapec si vzal kalhoty se židle vedle lůžka a natáhl si je vsedě na kavalci.\n")
        .append(
            "Stařec vyšel ze dveří a chlapec ho následoval. Byl ospalý a stařec ho objal paži kolem ramenou a řekl mu \"Odpusť!\"\n")
        .append("\" Qué va, \" odpověděl chlapec. \"To přece člověk musí.\"\n")
        .append(
            "Šli po silnici k starcově chatrči a po celou cestu je míjeli ve tmě bosí muži, kteří nesli stěžně svých člunů. Když došli k chatrči, chlapec vzal kotouče šňůry v košíku a harpunu a bodec s hákem a stařec si hodil přes rameno stěžeň se svinutou plachtou.\n")
        .append("\"Nechcete kávu?\" zeptal se chlapec.\n")
        .append("\"Naložíme věci do člunu a pak se na ni někde stavíme.\"\n")
        .append(
            "Vypili kávu z plechovek od kondensovaného mléka v podniku otevřeném časně ráno pro rybáře.\n")
        .append(
            "\"Jak jste se vyspal, dědo?\" otázal se chlapec. Teď se pomalu probouzel, třebaže mu bylo ještě za těžko probrat se ze spánku.\n")
        .append(
            "\"Výborně, Manoline,\" odpověděl mu stařec. \"Dneska mám pocit, že to dopadne dobře.\"\n")
        .append(
            "\"Já taky,\" přidal se chlapec. \"Musím teď pro naše sardinky a pro vaše čerstvé návnady. On si nosí výstroj sám. Nikdy nechce, aby mu něco nesl někdo druhý.\"\n")
        .append(
            "\"To my dva jsme jiní,\" řekl stařec. \"Nechal jsem tě nosit věci, když ti bylo pět let.\"\n")
        .append(
            "\"Já vím,\" přikývl chlapec. \"Hned se vrátím. Dejte si ještě jednu kávu! Máme tady úvěr.\"\n")
        .append(
            "Odešel bos přes korálové skály k ledárně, kde měl uloženou návnadu.\n")
        .append(
            "Stařec pomalu srkal kávu. To bylo všechno, co za celý den pozře, a on věděl, že ji musí vypít. Dávno ho už teď omrzelo jíst a nikdy si s sebou nebral nic k obědu. Měl na přídi loďky láhev vody a to bylo všechno, co na celý den potřeboval.\n")
        .append(
            "Chlapec se mezitím vrátil se sardinkami a s dvěma návnadami zabalenými do novin a oba pak sešli po stezičce k loďce, cítíce pod nohama omletý písek, nadzdvihli člun a sešoupli jej do vody.\n")
        .append("\"Dobrý lov, dědo!\"\n")
        .append(
            "\"Dobrý lov!\" poděkoval stařec. Navlekl provazové smyčky vesel na kolíkové čepy, a nakláněje se dopředu proti záběrům vesel, začal veslovat ze zátoky ven do tmy. Z ostatních pláží vyplouvaly na moře i jiné čluny a stařec slyšel, jak se jejich vesla hrouží a zabírají, i když je teď, kdy se měsíc schoval za kopce, nemohl vidět.\n")
        .append(
            "Občas někdo v některém člunu promluvil. Ale většina člunů plula mlčenlivě až na pleskání vesel. Rozptýlily se, jakmile vypluly z ústí zátoky, a každý si to namířil do té části oceánu, kde doufal narazit na ryby. Stařec si byl vědom, že popluje daleko, zanechal pach pevniny za sebou a vyrazil vstříc předjitřní vůni oceánu. Viděl ve vodě fosforeskovat chaluhy, když vesloval tou částí oceánu, které rybáři říkali veliká studně, protože se tu náhle otvírala sedmistysáhová hlubina, kde se shlukovaly ryby všeho druhu, stahované sem vírem, jenž vznikal nárazy proudu o srázné hradby na dne oceánu. Soustředili se tu mořští ráčci a ryby sloužící za vnadidlo a někdy v nejhlubších děrách hejna šípovitých hlavonožců, kteří v noci vyplouvali až pod hladinu, kde se jimi živily všechny kolem táhnoucí ryby.\n")
        .append(
            "Stařec cítil ve tmě nadcházející jitro, a jak vesloval, slyšel frčení, se kterým létavé ryby vyskakovaly z vody, a sykot jejich ztuha roztažených křídel, když se vznášely ve tmě pryč. Cítil k létavým rybám velkou náklonnost, byly to na oceánu jeho největší přítelkyně. Litoval ptáky, zvlášť drobné a útlé tmavé mořské vlaštovky, které věčně kroužily a vyhlížely a skoro nikdy nic nenalézaly, a myslel si:\n")
        .append(
            "\"Ptáci mají těžší život než my, až na dravce a na ty, co jsou statní a silní. Proč vlastně udělali tak útlé a něžné ptáčky, jako jsou tyhle mořské vlaštovky, když vřava oceánu dokáže být tak ukrutná? Spousta vod je laskavá a velice krásná. Ale dokáže být tak ukrutná a vymrštit se tak náhle, a takovíhle ptáčci, kteří se vznášejí, hrouží do vln a shánějí potravu s tím svým tenkým smutným pípáním, jsou pro ni příliš něžní.\"\n")
        .append(
            "Myslel na moře vždycky v ženském rodě, jako na la mar, jak mu lidé říkají ve španělštině, když je milují. Někdy o té mořské spoustě mluví špatně i ti, kdož ji milují, ale říkají to vždycky, jako by hovořili o ženě. Někteří mladší rybáři, ti, co užívali bojí jako splávků pro své šňůry a měli motorové čluny, koupené, když jim žraloci játra vynesla hodně peněz, mluvili o moři v mužském rodě, říkali el mar. Mluvili o něm jako o nějakém soupeři nebo o zeměpisném názvu nebo dokonce jako o nepříteli. Ale stařec na tu vodní spoustu myslil vždycky jako na ženskou bytost, která člověku věnuje nebo odpírá velikou přízeň, a jestliže provádí divoké či zlomyslné kousky, je to jen proto, že nemůže jinak. Měsíc na ni působí jako na ženu, myslel si.\n")
        .append(
            "Vesloval vytrvale a nenamáhal se při tom, protože nepřekročil svou obvyklou rychlost a hladina oceánu byla hladká až na občasná zavíření v proudu. Nechal proud, aby ze třetiny pracoval za něj, a když začalo svítat, shledal, že se už dostal dál, než v tuhle hodinu doufal.\n")
        .append(
            "Zkoušel jsem ty hluboké studně celý týden a nic z toho nebylo, myslel si. Dnes se vypravím hloub do moře, kde jsou hejna tuňáků bonitos a albacore, a mezi nimi se snad najde nějaký pořádný kus.\n")
        .append(
            "Než se opravdu rozednilo, měl už vnadidla ve vodě a dal se unášet proudem. Jednu návnadu spustil do hloubky čtyřiceti sáhů. Druhou do pětasedmdesáti a třetí a čtvrtá se vznášela v modré vodě v hloubce jednoho sta a stopětadvaceti sáhů. Všechny ryby, kterých užil jako vnadidla, visely hlavou dolů, provlečeny dříkem háku, pevně svázány a sešity, a vyčnívající zahnutá část háku a hrot byly pokryty čerstvými sardinkami. Všechny sardinky byly navlečeny na hák za oba boční otvory, tak že tvořily na vyčnívající oceli poloviční věnec. Na háku nebylo jediné místečko, jehož se mohla veliká ryba dotknout, které by sladce nezavánělo a příjemně nechutnalo.\n")
        .append(
            "Chlapec mu dal dva čerstvé malé tuňáky nebo albacory, kteří viseli na dvou nejhlubších šňůrách jako olovnice, a na dvou ostatních měl dva kranasy, jednoho velkého modrého a druhého zlatavého, kterých užil už dříve, ale byli ještě v dobrém stavu a výborné sardinky jim dodávaly vůně a přitažlivosti. Na každou šňůru, silnou jako tlustá tužka, byl smyčkou přivázán čerstvě uříznutý klacek, který by se ponořil, kdyby ryba ťukla o vnadidlo nebo zatahala za ně, a každá šňůra měla dva čtyřicetisáhové kotouče, které se daly navázat na ostatní zásobní kotouče, takže v případě potřeby mohla chycená ryba odvinout přes tři sta sáhů šňůry.\n")
        .append(
            "Teď stařec pozoroval přes pažení loďky, jak se tři klacky noří do vody, a zlehka vesloval, aby udržel šňůry svisle napjaté a v patřičných hloubkách. Bylo už docela světlo a každou chvíli už muselo vyjít slunce.\n")
        .append(
            "Slunce vystoupilo krajíčkem z moře a stařec uviděl ostatní čluny, nízko na vodě a hezky daleko směrem ke břehu, jak se rozptýlily po šířce proudu. Pak slunce vysvitlo jasněji a jeho záře dopadla na vodu a pak, když se vyhouplo celé, odráželo mu je hladké moře do očí, až jej prudce rozbolely, a on vesloval nedívaje se do něho. Hleděl do vody a pozoroval šňůry spadající dolů do zšeřelé hloubky. Nikdo jiný je nedokázal udržet rovnej i, tak aby ve všech vrstvách temnoty vodního proudění, přesně tam, kde chtěl, čekalo vnadidlo na každou rybu, která by plula kolem. Jiní rybáři si je nechali brát proudem a často měli vnadidlo v hloubce šedesáti sáhů, když byli přesvědčeni, že dosáhli stovky.\n")
        .append(
            "To já, myslel si stařec, s nimi zacházím přesně. Jenomže už nemám štěstí. Ale kdož ví? Možná dnes. Každý den přináší něco nového. Mít štěstí je lepší. Ale já budu radši svědomitý. Když pak člověka potká štěstí, je aspoň připraven.\n")
        .append(
            "Slunce zatím vystoupilo o dvě hodiny výše a už ho tak nebolelo do očí, když se podíval na východ. V dohledu byly už jen tři čluny, které se rýsovaly velmi nízko a daleko ke břehu.\n")
        .append(
            "Celý život mě časné slunce pálí do očí, pomyslil si stařec. Ale oči mi slouží ještě dobře. Večer se můžu podívat přímo do slunce a nezatmí se mi před očima. A večer má slunce větší sílu. Jenže ráno to bolí.\n")
        .append(
            "Vtom si všiml ptáka fregatky, který před ním kroužil na obloze na dlouhých černých perutích. Pták náhle prudce klesl, spustil se dolů s křídly přitaženými k tělu a pak zase zakroužil.\n")
        .append(
            "\"Něco tam má,\" řekl si stařec nahlas. \"Jenom tak se nedívá.\"\n")
        .append(
            "Vesloval zvolna a vytrvale tam, kde pták kroužil. Nepospíchal a udržoval šňůry rovně ve svislé poloze. Ale předstihl trochu proud, takže stále ještě lovil jaksepatří, třebaže o něco rychleji, než by lovil, kdyby se nesnažil dát se vést ptákem.\n")
        .append(
            "Pták se vznesl ve vzduchu výše a opět zakroužil s nepohnutými křídly. Pak se náhle vrhl dolů a stařec uviděl létavé ryby vystřelit z vody a zoufale plachtit po hladině.\n")
        .append("\"Dorády,\" řekl si stařec nahlas. \"Velké dorády.\"\n")
        .append(
            "Složil vesla do loďky a vytáhl zpod paloubky na přídi tenkou šňůru. Končila drátěným nástavcem a středně velkou udicí, kterou navnadil jednou ze sardinek. Hodil ji přes boční pažení a pak ji přivázal ke kruhu přišroubovanému na zádi. Pak navnadil ještě jednu šňůru a nechal ji stočenou ve stínu přídě. Dal se zase do veslování a pozoroval černého ptáka s dlouhými perutěmi, který teď kroužil nízko nad vodou.\n")
        .append(
            "Jak ho tak pozoroval, pták se opět vrhl dolů s křídly přitaženými k tělu pro střemhlavý pád a pak jimi začal divoce a bezvýsledně máchat v honbě za létavými rybami. Stařec viděl lehké vyboulení vody zdvíhané velkými dorádami, jak pronásledovaly unikající ryby. Dorády brázdily vodu pod čarou jejich letu a doženou se ve vodě plnou rychlostí na místo, kam ryby dopadnou. Je to pořádné hejno dorád, pomyslel si stařec. Jsou rozptýleny do šířky a létavé ryby mají malé vyhlídky. Pták nemá žádnou vyhlídku. Létavé ryby jsou na něho příliš veliké a příliš rychlé.\n")
        .append(
            "Pozoroval, jak létavé ryby znovu a znovu prorážejí hladinu a jak se pták bezvýsledně snaží. To hejno mi uteklo, pomyslel si. Vyrazily moc daleko a moc rychle. Ale možná, že dostanu některou, co od nich zabloudila, a možná, že je jim nablízku moje velká ryba. Někde ta má veliká ryba být musí.\n")
        .append(
            "Oblaka nad pevninou se teď nakupila jako hory a pobřeží se změnilo v dlouhou zelenou čáru, za kterou se zvedaly šedomodré kopce. Voda teď měla barvu temně modrou, tak temnou, že byla skoro fialová. Kdy ž se podíval do hloubky, viděl v tmavé vodě jakoby prosátý červený plankton a zvláštní světlo, vrhané teď sluncem. Pozoroval své šňůry a hleděl, jak splývají přímo dolů, až ve vodě mizely z dohledu, a byl rád, že vidí tolik planktonu, protože to znamenalo ryby. Zvláštní světlo, kterým slunce, teď když stálo výše, prozařovalo vodu, znamenalo pěkné počasí, právě tak jako tvar oblak nad pevninou. Ale pták se zatím dostal skoro z dohledu a na hladině nebylo vidět nic než několik pruhů žlutých, sluncem vyrudlých sargasových chaluh a fialový, dokonale utvářený duhově hrající rosolovitý měchýř žahavého trubejše, zvaného portugalský bitevník, plynoucí po vodě těsně v blízkosti člunu. Převalil se na bok a pak se zase narovnal. Plynul si vesele jako bublina a vláčel za sebou na loket ve vodě svá dlouhá jedovatá fialová vlákna. \"Agua malá, \" řekl člověk. \"Ty děvko!\"\n")
        .append(
            "S místa, kde se lehce opřel do vesel, se zadíval dolů do vody a viděl drobné rybky, zbarvené stejně jako vláčející se vlákna, které pluly mezi vlákny a pod skvrnkou stínu vrhaného vznášející se bublinou. Její jed na ně neplatil. Ale na člověka ano, a kdyby se některé vlákno zachytilo na šňůře a přilnulo tam, slizké a fialové, až bude starý přitahovat rybu, naskočily by mu na pažích a na rukou puchýře a vyrážky podobně, jako když člověka žahne list kulčiby nebo škumpy jedovaté. Ale tyhle kožní otravy, které působí agua malá, se objeví jedna dvě a šlehnou jako bič.\n")
        .append(
            "Duhově hrající bubliny byly krásné. Ale byla to ta nejproradnější krása na moři a stařec se rád díval, jak je žerou velké mořské želvy. Želvy je uvidí, přiblíží se k nim zpředu, pak zavřou oči, takže jsou úplně obrněny, a sežerou je i s vlákny a se vším všudy. Stařec se rád díval, jak je žerou želvy, a rád po nich šlapal na břehu po bouři a poslouchal, jak lupají, když na ně stoupne zrohovatělými chodidly.\n")
        .append(
            "Miloval zelené želvy a zobanovité želvy karetové, elegantní a rychlé a velmi ceněné, a cítil přátelské pohrdání pro ohromné tupé hlavaté karety, zbabělé ve svých krunýřích, podivné ve svém milování a blaženě požírající se zavřenýma očima žahavé trubejše.\n")
        .append(
            "Nevěřil u želv na žádnou mystiku, třebaže je mnoho let jezdíval ve člunu lovit. Litoval je všechny, i ty s obrovskými pancíři, které byly dlouhé jako loďka a vážily celou tunu. Většina lidí k želvám v srdci nic necítí, protože želví srdce bije ještě hodiny poté, co byla želva rozříznuta a vyvržena. Ale stařec si myslel : Já mám zrovna takové srdce, i nohy a ruce mám, jako jsou jejich. Jedl jejich bílá vejce, aby nabyl síly. Jedl je po celý květen, aby byl v září a v říjnu dost silný na opravdu velké ryby.\n")
        .append(
            "Pil také každý den šálek rybího tuku ze žralocích jater z plechového barelu v kůlně, kde si mnoho rybářů ukládalo výstroj. Stál tam pro všechny rybáře, kteří o něj měli zájem. Většině z nich se hnusila jeho chuť. Ale nebylo to o nic horší než vstávat tak časně, jako museli, a bylo to výborné proti všem druhům nachlazení a chřipek a prospívalo to očím.\n")
        .append("Teď stařec pohlédl vzhůru a uviděl, že pták krouží zase.\n")
        .append(
            "\"Objevil ryby,\" řekl si nahlas. Létavé ryby se však nad hladinou neukázaly, ani se tu nehemžily drobné rybičky. Ale jak se tak stařec díval, vyhoupl se do povětří malý tuňák, otočil se a padl do vody hlavou napřed. Zablýskl se ve slunci jako stříbro, a jakmile dopadl zpátky, vyskočil další a zase další a skákali tak se všech stran, vířili vodu a vrhali se dlouhými skoky po rybičkách. Kroužili kolem nich a štvali je před sebou.\n")
        .append(
            "Jestli nepoplují moc rychle, dostanu se mezi ně, pomyslel si stařec a pozoroval, jak hejno zpěňuje vodu do bělá a jak se pták náhle spustil dolů a vrhl se na drobné sardinky, které panický strach vypudil až ke hladině.\n")
        .append(
            "\"Ten pták je ohromný pomocník,\" řekl si stařec. Právě v tom okamžiku se mu šňůra uvázaná na zádi napjala pod nohou, kde si před chvílí ponechal volnou smyčku. Pustil vesla, a když uchopil šňůru pevně a začal ji soukat k sobě, ucítil tíži a chvějivý tah malého tuňáka. Jak táhl, chvění sílelo a pak ve vodě uviděl jeho modrý hřbet a jeho zlaté boky, než jej přehodil přes pažení do člunu. Ležel na zádi v slunci, jako vysoustruhovaný z jednoho kusu do tvaru granátu, veliké a nechápavé oči dokořán, a utloukal se k smrti o podlážku člunu prudkými chvějivými údery čistě vykrojeného a rychle se mrskajícího ocasu. Stařec ho z milosti klepl přes hlavu a odkopl jeho dosud se cukající tělo do stínu pod zadní paloubku.\n")
        .append(
            "\"Albacore,\" řekl si nahlas. \"To bude báječné vnadidlo. Váží dobrých deset liber.\"\n")
        .append(
            "Nevzpomínal si už, kdy vlastně začal sám k sobě mluvit nahlas. Kdysi dávno si o samotě zpíval, a zpívával si někdy v noci, když míval hlídku na rybářských kutrech či na bárkách lovících želvy a když sám kormidloval. Začal nejspíš mluvit nahlas sám pro sebe, když s ním přestal jezdit chlapec. Ale nepamatoval se už. Když ry-baříval s chlapcem, mluvili na sebe obyčejně, jen co bylo nutné. Hovořívali spolu v noci nebo když jim ve vyplutí zabránila bouře či špatné počasí. Na moři se považovalo za ctnost nemluvit, když to není nutné, a stařec to tak vždycky bral a dodržoval to. Ale teď, když s ním nebyl nikdo, komu by to mohlo vadit, vyslovoval hlasitě své myšlenky často.\n")
        .append(
            "\"Kdyby mě slyšeli mluvit ostatní, pomysleli by si, že mně přeskočilo,\" řekl nahlas. \"Ale mně nepřeskočilo, a takje mi to jedno. Ostatně boháči mají na svých lodích radu, aby na ně mluvila a hlásila jim výsledky baseballu.\"\n")
        .append(
            "Jenže teď není čas myslet na baseball, napadlo ho. Teď je čas myslet jenom najedno. Na to, pro co jsem se narodil. Poblíž toho hejna by mohla být nějaká pořádná. Chytil jsem jenom nějakého zbloudilce od těch albacorů, co se tam krmili. Ale mají dnes nějak na pilno a dostali se daleko. Všechno, co se dnes ukáže na hladině, má nějak naspěch a všechno k severovýchodu. Je to snad tou denní dobou? Nebo je to nějaká známka změny počasí, kterou neznám?\n")
        .append(
            "Neviděl už zeleň pobřeží, jenom vršky modravých kopců, které se zdály bílé, jako by měly sněžné čepičky, a oblaka, která se nad nimi tyčila jako vysoké sněžné pohoří. Moře bylo velice temné a světlo se ve vodě rozkládalo jako v hranolu. Myriády teček planktonu se rozplynuly v záři vysokého slunce a stařec teď viděl v modré hloubce jenom obrovitá prismata lámajících se paprsků a své šňůry, splývající kolmo do vody na míli hluboké.\n")
        .append(
            "Tuňáci - rybáři říkali všem rybám toho druhu tuňáci a rozlišovali je příslušnými jmény, jenom když je přišli prodat nebo vyměnit za návnadu - tuňáci opět klesli dolů. Slunce teď pálilo a starý je cítil v zátylku a cítil, jak mu při veslování stéká čůrkem po zádech pot.\n")
        .append(
            "Mohl bych se dát nést proudem, pomyslel si, usnout a navléknout si kličku šňůry na palec u nohy, abych se probudil. Ale dnes je to pětaosmdesát dní a měl bych dnes rybařit pořádně.\n")
        .append(
            "Právě v tom okamžiku, jak tak pozoroval šňůry, se jeden z vyčnívajících zelených klacků prudce potopil. \"Ano!\"řekl si, \"ano!\" a složil vesla do člunu tak, aby člunem netrhl. Sáhl po šňůře a ozkoušel ji jemně mezi palcem a ukazováčkem pravé ruky. Necítil žádný tah ani tíhu a zlehka šňůru podržel. Pak to přišlo znovu. Tentokrát ucítil zkusmé škubnutí, ani důrazné ani silné, a poznal přesně, oč jde. V hloubce sta sáhů ožíral mečounovitý marlin sardinky, zakrývající hrot a dřík udice v místě, kde ručně kovaný hák vyčníval z hlavy malého tuňáka.\n")
        .append(
            "Stařec zlehýnka podržel šňůru a levičkou z ní citlivě vyprostil klacek. Teď si ji mohl nechat probíhat mezi prsty, aniž ryba cítila nejmenší napětí.\n")
        .append(
            "V téhle vzdálenosti od břehu a v tomhle měsíci musí být obrovská. Jen je sněz, rybo! Sněz je! Prosím tě je sněz! Jsou tak čerstvé a ty jsi tam dvě stě metrů hluboko v té studené vodě a tmě. Zakruž tam ve tmě ještě jednou, vrať se a sněz je!\n")
        .append(
            "Ucítil lehké jemné cukání a pak prudší škubnutí, asi když hlava některé sardinky nešla tak snadno odtrhnout s háku. A pak nic.\n")
        .append(
            "\"Pojď, pojď!\" vábil ji starý nahlas. \"Ještě jednou se obrať! Jen si k nim přivoň! Nejsou báječné? Sněz je všechny a pak tě čeká tuňák. Tuhý, chladný a lákavý. Nestyď se, rybo! Sněz je!\"\n")
        .append(
            "Čekal se šňůrou mezi palcem a ukazováčkem, pozoroval ji zároveň s ostatními šňůrami, protože ryba mohla vyplout výš nebo se ponořit hlouběji. Pak ucítil opět to lehounké cukání.\n")
        .append(
            "\"Zabere,\" pronesl stařec nahlas. \"Kriste Ježíši, ať zabere!\"\n")
        .append(
            "Ale ryba nezabrala. Zmizela a stařec necítil nic. \"Nemohla zmizet,\" řekl. \"Pánbůh ví, že nemohla zmizet. Bere zatáčku. Možná, že se už někdy chytila a ještě se na to pamatuje.\"\n")
        .append("Pak ucítil, jak sebou šňůra mírně trhla, a byl šťasten.\n")
        .append("\"To se jenom obracela,\" potvrdil si.\n")
        .append(
            "Byl šťasten, když cítil mírné cukání, a pak ucítil prudké škubnutí a něco neuvěřitelně těžkého. Byla to váha ryby a on popouštěl šňůru hloub, hloub a hloub, odvíjeje první ze zásobních kotoučů. Jak se šňůra ponořovala, klouzajíc mu mezi prsty, cítil stařec neustále tu obrovskou tíži, třebaže stisk jeho palce a ukazováčku byl téměř neznatelný.\n")
        .append(
            "\"To je ale ryba!\" řekl si. \"Drží teď tuňáka napříč v hubě a odnáší si ho pryč.\"\n")
        .append(
            "Pak se obrátí a spolkne ho, pomyslel si. To nahlas nevyslovil, protože věděl, že když člověk vysloví něco dobrého, může to tím překazit. Poznal, jak ohromná ta ryba je, a myslel na ni, jak odplouvá temnotou s tuňákem křížem v hubě. V tom okamžiku ucítil, že ryba ustala v pohybu, ale její tíhu cítil stále. Pak ta tíha vzrostla a on popustil šňůru. Stiskl ji na okamžik palcem a ukazováčkem, napětí zesílilo a začalo tíhnout kolmo dolů.\n")
        .append(
            "\"Zabrala!\" řekl nahlas. \"Teď ji nechám, aby to pořádně pozřela.\"\n")
        .append(
            "Nechal si šňůru proklouzávat mezi prsty, zatím co levičkou sáhl dolů a navázal volný konec prvních dvou zásobních kotoučů další šňůry. Teď byl připraven. Měl teď v zásobě tři čtyřicetisáhové kotouče šňůry navíc ke kotouči, který právě odvíjel.\n")
        .append(
            "\"Spolkni to ještě lip,\" promluvil. \"Spolkni to pořádně!\"\n")
        .append(
            "Spolkni to tak, aby ti hrot háku pronikl do srdce a zabil tě, pomyslel si. Vypluj zlehka a nech do sebe vrazit harpunu. Dobrá. Jsi hotová? Máš už toho krmení dost?\n")
        .append(
            "\"Teď!\" vykřikl hlasitě a trhl prudce oběma rukama, vybojoval si metr šňůry a pak se znovu a znovu chápal střídavě oběma rukama vytahovaného lana a komíhal se na něm veškerou silou paží i váhou svého těla, vzepřeného jako čep.\n")
        .append(
            "Nic se nestalo. Ryba prostě pomalu odplouvala a stařec ji nemohl přitáhnout ani o coul blíž k hladině. Šňůru měl pevnou, dělanou na těžké ryby, a teď si ji přehodil přes záda a táhl, až se napjala tak, že od ní odstřikovaly kapičky vody. Pak začala šňůra ve vodě pomalu syčet a on stále táhl, vzpíraje se o veslařské sedátko a zakláněje se proti směru tahu. Člun se pomalu hnul k severozápadu.\n")
        .append(
            "Ryba plula vytrvale, a tak pomalu cestovali po klidném moři. Ostatní vnadidla byla dosud ve vodě, ale nedalo se nic dělat.\n")
        .append(
            "\"Kdyby tak se mnou byl chlapec!\" řekl si stařec nahlas. \"Ryba mě vzala do vleku a já tady trčím jako ouvazník pro vlečné lano. Mohl bych šňůru přivázat. Ale to by ji mohla přetrhnout. Musím ji držet, co mám síly, a popouštět jí šňůru, jak bude potřebovat. Zaplať pánbůh, že pluje dál a ne do hloubky.\"\n")
        .append(
            "Co si počnu, jestli j i napadne ponořit se, to nevím. Co si počnu, jestli zajede do hloubky a dodělá, to taky nevím. Ale něco už udělám. Mám ještě spoustu možností.\n")
        .append(
            "Vzpíral šňůru přehozenou přes záda, sledoval, v jakém úhlu mizí pod hladinu a jak loďka nepřestajně míří k severozápadu.\n")
        .append(
            "Tohle ji zabije, myslel si stařec. Nevydrží to přece věčně. Ale po čtyřech hodinách plula ryba vytrvale dál do oceánu, vlekla člun a stařec se ještě stále houževnatě vzpíral tahu se šňůrou přes záda.\n")
        .append(
            "\"Když zabrala, bylo poledne,\" řekl nahlas. \"A ještě jsem ji neviděl.\"\n")
        .append(
            "Předtím než ryba zabrala, narazil si slaměný klobouk pevně na hlavu, a teď ho řezal do čela. Měl taky žízeň, spustil se na kolena a opatrně, aby neškubl šňůrou, dolezl jak jen mohl daleko na příď a sáhl jednou rukou po láhvi s vodou. Otevřel ji a trochu se napil. Pak se opřel o příď a odpočíval. Odpočíval vsedě na nevztyčeném stěžni s plachtou a snažil se nemyslet, jen to vydržet.\n")
        .append(
            "Pak se ohlédl dozadu a zjistil, že ztratil zemi z dohledu. Na tom nezáleží, pomyslel si. Vždycky najdu cestu zpátky podle světel Havany. Do západu slunce zbývají ještě dvě hodiny a do té doby možná ryba vyplave. A jestli ne, snad vyplave, až vyjde měsíc. A jestli neudělá ani to, snad vyplave s východem slunce. Nemám žádné křeče a cítím se silný . To ona má hák v hubě. Ale musí to být pane ryba, když takhle táhne. Má nejspíš hubu pevně semknutou kolem drátu. Chtěl bych ji vidět. Aspoň jednou bych ji chtěl uvidět, abych věděl, s čím mám co dělat.\n")
        .append(
            "Pokud mohl stařec určit z pozorování hvězd, nezměnila ryba za celou tu noc směr ani rychlost. Po západu slunce se ochladilo a starci uschl na zádech, na pažích a na starých nohou studený pot. Dříve během dne vzal pytel, který přikrýval bedničku s návnadou, a rozprostřel ho, aby se na slunci usušil. Po západu slunce si jej uvázal kolem krku tak, že mu splýval na záda, a opatrně jej podstrkal pod šňůru, kterou měl teď přes ramena. Podložil pytlem šňůru jako polštářkem a našel si způsob, jak se opřít dopředu o příď, takže měl skoro pohodlí. Ve skutečnosti ta posice byla jenom o něco méně nesnesitelná, jemu však připadala skoro pohodlná.\n")
        .append(
            "Nesvedu nic s ní a ona nesvede nic se mnou, pomyslel si. Aspoň tak dlouho, dokud bude v tomhle pokračovat. Jednou vstal, vymočil se přes okraj loďky, podíval se na hvězdy a zkontroloval si kurs. Šňůra se rýsovala ve vodě už od jeho ramenou jako fosforeskující pruh. Pluli teď pomaleji a záře světel z Havany nebyla tak jasná, takže poznal, že je nejspíš proud unáší směrem k východu. Jestli ztratím světla Havany z dohledu, bude to znamenat, že míříme ještě dál na východ, pomyslel si. Jestli se ryba neodchýlila od svého směru, měl bych je vidět ještě celé hodiny. Rád bych věděl, jak dnes dopadl baseball v první lize, uvažoval v duchu. Bylo by báječné mít při tomhle rádio. Pak se vzpamatoval - na to myslíš pořád. Mysli na to, co děláš! Nesmíš provést žádnou hloupost.\n")
        .append(
            "Potom pronesl nahlas : \"Kdybych tady tak měl chlapce! Aby mi pomohl a tohle viděl.\"\n")
        .append(
            "Nikdo by na stará kolena neměl být sám, uvažoval. Ale není vyhnutí. Nesmím zapomenout sníst toho tuňáka, než se zkazí, abych se udržel při síle. Nezapomeň, bez ohledu na to, že se ti do něho vůbec nechce, musíš ho ráno sníst! Nezapomeň, připomínal si v duchu.\n")
        .append(
            "Během noci se k člunu přiblížily dvě plískavice a on je slyšel, jak se převalují a odfrkují. Byl s to rozeznat odfrkování samce od vzdychavého frkání samice.\n")
        .append(
            "\"To jsou dobří tvorové,\" řekl si. \"Hrají si a laškují a mají jeden druhého rádi. Jsou naši bratři jako létavé ryby.\"\n")
        .append(
            "Pak začal litovat velikou rybu, kterou chytil na hák. Je báječná a tak podivná, a kdo ví, jak je stará, myslel si. Ještě nikdy jsem neměl co dělat s tak silnou rybou, nebo s rybou, která by si vedla tak divně. Snad je příliš moudrá na to, aby skákala. Strhala by mě, kdyby začala skákat nebo se najednou divoce utrhla. Ale možná že se už mockrát chytila a ví, že musí bojovat právě takhle. Nemůže vědět, že proti ní stojí jen jeden člověk a zeje starý. Ale jaký to je obr a kolik vynese na trhu, jestli má dobré maso! Zabral na vnadidlo jako samec a táhne jako samec a bojuje beze vší paniky. Rád bych věděl, jestli má v hlavě nějaký plán, nebo jestli je právě tak zoufalý, jako jsem já?\n")
        .append(
            "Vzpomněl si, jak jednou chytil na hák samici z párku marlinů. Samec nechává samici vždycky nažrat první a chycená samice se pustila do divokého, zděšeného a zoufalého zápasu, který ji brzy vyčerpal, a samec celou tu dobu zůstal při ní, plul přes šňůru a kroužil se samicí na hladině. Držel se tak blízko, že se starý bál, aby mu nepřeřízl šňůru svým ocasem, ostrým jako kosa a téměř stejného rozměru a tvaru. Když ji starý přitáhl hákovým bodcem a bušil do ní kyjem, drže ji za její rapírovitý kloun s povrchem jako ze smirkového papíru, bušil jí do vršku lebky, až změnila barvu skoro do odstínu zadní strany zrcadel, a když ji pak s chlapcovou pomocí vy táhl do člunu, samec zůstal po boku loďky. A zatím co pak starý uvolňoval šňůru a chystal si harpunu, samec vyskočil vedle člunu vysoko do vzduchu, aby se podíval, kde je samice, a pak sjel dolů do hloubky, s široce roztaženými levandulově zbarvenými křídly, jimž se podobaly jako prsní ploutve, a vyvstaly mu všechny levandulově nafialovělé pruhy. Byl velice krásný, vzpomínal si stařec, a věrně zůstal.\n")
        .append(
            "To byla nejsmutnější věc, kterou jsem s nimi kdy zažil, pomyslel si stařec. Chlapec byl tenkrát taky smutný. Poprosili jsme ji za odpuštění a hned jsme ji vyvrhli a zpracovali.\n")
        .append(
            "\"Kéž by teď chlapec byl se mnou!\" řekl nahlas, usadil se a opřel se o skruž paloubky na přídi a cítil skrze šňůru sílu obrovské ryby, napřenou k neznámému cíli, pro který se ryba rozhodla.\n")
        .append(
            "Když už se následkem mého úkladu nějak rozhodnout musela, pomyslel si stařec.\n")
        .append(
            "Sama by se bývala rozhodla zůstat tam dole v temné hloubce daleko mimo dosah všech nástrah a pastí a úkladů. Já se rozhodl jít za ní a najít ji mimo dosah všech lidí. Mimo dosah všech lidí na světě. Teď jsme spolu spojeni a jsme tak spojeni už od poledne. A nikdo nepomůže ani jednomu z nás.\n")
        .append(
            "Snad jsem se neměl stát rybářem, pomyslel si. Ale k tomu jsem se narodil. Určitě nesmím zapomenout sníst toho tuňáka, až začne svítat.\n")
        .append(
            "Někdy před svítáním zabralo něco najedno z vnadidel, které vláčel za sebou. Slyšel, jak praskl klacek a šňůra se začala rychle odvíjet přes obrubeň loďky. Vytáhl v temnotě z pochvy nůž, nechal si všechen tah ryby spočinout na levém rameni, zaklonil se dozadu a uřízl tu šňůru na podložce dřevěné obrubně. Pak odřízl druhou šňůru, která mu byla nejblíž, a svázal potmě volné konce zásobních kotoučů. Pracoval obratně jednou rukou a přišlápl kotouče nohou, aby je přidržel, když utahoval uzly. Měl teď šest zásobních kotoučů šňůry. Dva od každé návnady, kterou odřízl, a dva od návnady, na kterou ryba zabrala, a všechny byly svázány dohromady.\n")
        .append(
            "Až se rozední, myslel si, přelezu dozadu k tomu čtyřicetisáhovému vnadidlu, uříznu je taky a zásobní kotouče svážu. Přijdu tak o dvě stě sáhů dobrého katalánského cordelu, o háky a drátěné nástavce. To se dá nahradit. Ale kdo mi nahradí tuhle rybu, jestli chytím nějakou jinou rybu a ona mi ji odřízne? Nevím, co to bylo zač, co mi teď právě zabralo. Mohl to být marlin nebo žralok. Ani jsem to necítil. Musel jsem se toho zbavit moc nahonem.\n")
        .append("Nahlas řekl: \"Kdyby tak tady byl chlapec!\"\n")
        .append(
            "Ale chlapec tady není, pomyslel si. Jsi tady jen ty sám a měl by ses radši dostat k poslední šňůře hned teď, tma netma, odříznout ji a navázat zásobní kotouče.\n")
        .append(
            "A taky to provedl. Bylo to potmě těžké a ryba sebou jednou trhla tak prudce, že upadl na obličej a roztrhl si kůži pod okem. Krev mu stekla kousek po tváři, ale srazila se a uschla, než dosáhla brady, a on se doplazil zpátky na příď a odpočíval opřený o dřevo. Narovnal si pytel a posunul opatrně šňůru tak, že mu přišla na ramenou o kousek dál, a když si ji na ramenou zakotvil, opatrně zkusil, jak ryba táhne, a pak strčil ruku do vody, aby cítil, jak loďka pluje vpřed.\n")
        .append(
            "Rád bych věděl, po čem se to tak vrhla, pomyslel si. Drát po tom velikém kopci jejího hřbetu určitě sklouzl. Ji hřbet jistě tak nebolí jako mne. Ale nemůže ten člun táhnout věčně, ať je jak chce veliká. Mám teď s krku všechno, co by mi mohlo překážet, a mám pořádnou zásobu šňůry ; to je všechno, co může člověk chtít.\n")
        .append(
            "\"Rybo,\" oslovil ji tiše, \"zůstanu s tebou, dokud nevypustím duši.\"\n")
        .append(
            "Ona se mnou nejspíš zůstane taky, řekl si pak v duchu a čekal, až se rozední. Bylo teď v té chvíli před úsvitem chladno a stařec vrážel tělem do bednění, aby se zahřál. Dokážu to právě tak dlouho jako ona, myslel si. A v prvním úsvitu se šňůra začala rýsovat šikmo dolů do vody. Člun plul vytrvale a krajíček vycházejícího slunce se ukázal po starcově pravičce.\n")
        .append(
            "\"Nabírá si to na sever,\" řekl stařec. Proud nás asi zanesl daleko k východu, pomyslil si pak. Kdyby se tak stočila po proudu! To by znamenalo, že začíná být unavená.\n")
        .append(
            "Když slunce vystoupilo výše, uvědomil si stařec, že ryba unavena není. Bylo tu jen jedno příznivé znamení. Úhel šňůry ukazoval, že pluje v menší hloubce. Neznamenalo to ještě nutně, že bude skákat. Ale mohla by.\n")
        .append(
            "\"Pane bože, ať skáče!\" řekl stařec nahlas. \"Mám dost šňůry, abych ji zvládl.\"\n")
        .append(
            "Možná, že kdybych dokázal aspoň trochu zvětšit napětí, že by ji to bolelo a začala by skákat, pomyslel si. Ať skáče, teď když je světlo, a naplní si tak měchýře podél páteře vzduchem. Pak se nebude moci ponořit, aby dodělala.\n")
        .append(
            "Snažil se zvýšit napětí, ale šňůra byla už od chvíle, kdy ryba zabrala, napjatá až k prasknutí, a stařec cítil ten ukrutný odpor, když se zaklonil dozadu, aby táhl, a věděl přitom, že už do toho nemůže dát víc síly. Nesmím za žádnou cenu škubnout, připomínal si. Každé škubnutí rozšiřuje ránu, kudy vnikl hák, a když pak ryba začne skákat, mohla by jej vyplivnout. Ostatně se sluncem je mi lip a jednou se aspoň do něho nemusím dívat.\n")
        .append(
            "Na šňůru se nachytaly žluté chaluhy, ale stařec věděl, že to jenom přispívá k brždění, a měl z toho radost. Byly to žluté chaluhy z golfského proudu, které v noci tolik světélkují.\n")
        .append(
            "\"Rybo,\" promluvil k ní, \"z té duše tě miluju a vážím si tě. Ale zabiju tě, než skončí dnešní den.\"\n")
        .append("Aspoň doufám, dodal v duchu.\n")
        .append(
            "Od severu přiletěl k člunu malý ptáček. Byl to zpěvavý ptáček na cestě k jihu a letěl velmi nízko nad vodou. Stařec viděl, že je velice unavený.\n")
        .append(
            "Ptáček doletěl na záď loďky a usadil se tam. Pak obkroužil starci kolem hlavy a sedl si na šňůru, kde mu bylo pohodlněji.\n")
        .append(
            "\"Jakpak jsi starý?\" zeptal se stařec ptáčka. \"Je to tvůj první let?\"\n")
        .append(
            "Ptáček se na něho podíval, když promluvil. Byl příliš unaven i na to, aby si ohledal šňůru, a kymácel se na ní, jak se jí pevně zachytil útlounkýma nožkama.\n")
        .append(
            "\"Je pevná,\" řekl mu stařec. \"Až moc pevná. Neměl bys být tak unavený po bezvětrné noci. Co na takové ptáčky čeká?\"\n")
        .append(
            "Jestřábi, pomyslel si, kteří se vydávají nad moře, aby si na ně počíhali. Ale nic takového ptáčkovi neřekl. Ten by mu byl stejně nerozuměl a o jestřábech se dost brzy doví sám.\n")
        .append(
            "\"Pěkně si odpočiň, ptáčku,\" řekl mu nahlas. \"A pak leť a dělej, co umíš, jako každý člověk či pták či ryba.\" Hlasitý hovor mu dodával kuráže, protože mu v noci ztuhla záda a teď ho bolela doopravdy.\n")
        .append(
            "\"Zůstaň u mne doma, jestli chceš, ptáčku,\" promlouval k němu. \"Mrzí mě, že nemůžu vztyčit plachtu a vzít tě na břeh s tím větříkem, co se zdvíhá. Ale mám tady přítele.\"\n")
        .append(
            "Právě v tom okamžiku se ryba neočekávaně vrhla vpřed a strhla tak starce na příď a málem by ho byla stáhla přes palubu, kdyby se nebyl vzepřel a nepopustil o něco šňůru.\n")
        .append(
            "Ptáček uletěl, když sebou šňůra škubla, a stařec ho při odletu ani nezahlédl. Ohmatal šňůru pečlivě pravičkou a zpozoroval, že mu ruka krvácí.\n")
        .append(
            "\"Něco ji tam dole nejspíš zabolelo,\" řekl nahlas a zatáhl za šňůru, aby zjistil, jestli by rybu nedokázal obrátit. Ale když se šňůra napjala až k prasknutí, nechal toho být a usadil se, aby čelil jejímu tahu.\n")
        .append(
            "\"Teď to cítíš, rybo,\" poznamenal. \"A já, pánbůh ví, taky.\"\n")
        .append(
            "Rozhlížel se teď kolem po ptáčkovi, protože by ho byl měl rád za společníka. Ptáček byl pryč.\n")
        .append(
            "Dlouho ses nezdržel, pomyslel si člověk. Ale tam, kam letíš, to budeš mít horší, než se dostaneš na břeh. Jak to, že jsem dopustil, aby mě ryba poranila, když sebou tak prudce škubla? Nejspíš pořádně hloupnu. Nebo jsem se možná zadíval na toho ptáčka a myslel jsem na něho. Teď přiložím ruku k dílu a pak musím sníst toho tuňáka, aby mě neopustily síly.\n")
        .append(
            "\"Kdyby tak tady byl chlapec a kdybych tak měl trošku soli!\" povzdychl si nahlas.\n")
        .append(
            "Přesunul tíhu šňůry na levé rameno, opatrně si klekl a omyl si ruku v oceánu. Držel ji tam ponořenou víc než minutu, pozoroval, jak se odplavu]e krev a jak se o jeho ruku voda vytrvale rozráží pohybem člunu.\n")
        .append("\"Hodně zpomalila,\" uvědomil si.\n")
        .append(
            "Byl by rád nechal ruku ve slané vodě déle, ale měl strach, že sebou ryba zase prudce trhne, a tak vstal, rozkročil se pevně a nastavil ruku slunci. Byla to jenom odřenina od šňůry, jež se mu zařízla do masa. Ale bylo to v té části dlaně, kterou potřeboval při práci. Věděl, že před vyřízením téhle záležitosti bude mít práce ještě plné ruce, a nelíbilo se mu, že se poranil ještě dřív, než se do ní dal.\n")
        .append(
            "\"A teď,\" řekl si, když mu ruka uschla, \"musím sníst toho tuňáka. Dosáhnu na něj bodcem a sním si ho tady docela pohodlně.\"\n")
        .append(
            "Klekl si, vyšťáral tuňáka hákovitým bodcem pod zadní paloubkou a přitáhl si ho k sobě, dávaje pozor, aby nezavadil o stočené šňůry. Podržel šňůru přes levé rameno, a opíraje se o levou paži, sňal tuňáka s háku bodce a uložil bodec zpátky na místo. Přitiskl rybu jedním kolenem a nakrájel z ní podélně od zaber k ocasu pruhy temněrudého masa. Měly klínovitý tvar a vyřezával je od blízkosti páteře až dolů po okraj břicha. Když jich nařezal šest, rozprostřel je na přední paloubce, otřel si nůž o kalhoty, zvedl zbytky tuňáka za ocas a hodil je přes palubu.\n")
        .append(
            "\"Celého bonita bych asi sníst nedokázal,\" prohlásil a překrojil jeden z pruhů nožem napříč. Cítil vytrvalý pevný tah šňůry a levička mu ztrnulá křečí. Ztuhla mu kolem silného provazu a on se na ni podíval znechuceně.\n")
        .append(
            "\"Co jsi to vůbec za ruku?\" promluvil na ni. \"Tuhni si pak, jestli chceš. Proměň se v pařát! Nic ti to neprospěje.\"\n")
        .append(
            "Seber se, řekl si v duchu a podíval se dolů do temné vody na úhel šňůry s hladinou. Najez se teď, posílí ti to ruku! Ruka za nic nemůže, jsi už s tou rybou spoustu hodin. Ale vydržíš to s ní až do aleluja. Sněz teď toho bonita!\n")
        .append(
            "Vzal si kousek, strčil si ho do úst a pomalu žvýkal. Nebylo to nepříjemné.\n")
        .append(
            "Dobře to rozžvýkej, abys vyssál všechny šťávy! Nebylo by to špatné s kouskem zeleného nebo žlutého citronu nebo se solí.\n")
        .append(
            "\"Jak se cítíš, ruko?\" zeptal se křečovitě sevřené ruky, ztuhlé skoro tak jako v posmrtném ztrnutí. \"Sním kvůli tobě ještě kousek.\"\n");
       /* .append(
            "Snědl druhou část pruhu, který překrojil vejpůl. Pečlivě maso rozžvýkal a pak vyplivl kůži.\n")
        .append(
            "\"Tak co to dělá, ruko? Nebo je na to ještě brzy?\" Vzal si další pruh v celku a žvýkal.\n")
        .append(
            "\"Je to silná a výživná ryba,\" myslel si. \"Měl jsem štěstí, že jsem padl na ni a ne na dorádu. Doráda je moc sladká. Tenhle bonito není sladký skoro vůbec a má v sobě ještě všechnu sílu.\"\n")
        .append(
            "Přece jen má nějaký smysl být praktický, napadlo ho. Kdybych tak měl trochu soli! A nemám ponětí, jestli slunce zbytek masa vysuší nebo zkazí. Tak to radši sním všechno, i když nemám hlad. Ryba táhne klidně a vytrvale. Sním to všechno a pak budu připraven.\n")
        .append(
            "\"Měj strpení, ruko!\" promlouval k ní. \"Dělám to pro tebe.\"\n")
        .append(
            "Kdybych tak mohl nakrmit svého marlina tam dole, napadlo ho. Je to můj bratr. Ale musím ho zabít a na to si musím zachovat sílu. Snědl zvolna a svědomitě všechny klínovité pruhy rybího masa.\n")
        .append("Napřímil se a otřel si ruku o kalhoty .\n")
        .append(
            "\"Teď,\" řekl si. \"Můžeš pustit provaz, ruko, udržím ho jenom pravičkou, dokud nenecháš těch hloupostí.\" Stoupl si levou nohou na silnou šňůru, kterou dosud držel v levé ruce, a nalehl pozpátku proti tahu, jenž ho tlačil do zad.\n")
        .append(
            "\"Pane bože, ať mě ta křeč přejde!\" zaprosil. \"Vždy ť nevím, co ta ryba ještě provede.\"\n")
        .append(
            "Ale zdá se klidná, řekl si v duchu, a sleduje svůj plán. Ale jaký má plán? A jaký já? Já se musím zařídit podle ní, protože je tak ohromná. Jestli začne vyskakovat, tak ji zabiju. Ale zůstává tam dole celou věčnost. Tak i já zůstanu celou věčnost s ní.\n")
        .append(
            "Začal si třít křečovitě sevřenou ruku o kalhoty a snažil se oblomit si prsty. Ale ruka se neotevřela. Snad se otevře slunečním teplem. Snad se otevře, až strávím toho vydatného syrového tuňáka. Až ji budu potřebovat, otevřu ji stůj co stůj. Ale teď ji násilím otvírat nechci. Ať se otevře sama a vzpamatuje se sama od sebe. Naložil jsem toho konečně na ni moc v noci, když jsem musel uvolnit a navázat tolik těch šňůr.\n")
        .append(
            "Podíval se na moře a uvědomil si teď, jak je sám. Ale v hluboké temné vodě viděl prismata lámajících se paprsků, šňůru napínající se vpřed a podivné vlnění klidné hladiny. Oblaka se teď kupila tak, že se dal čekat pasátní vítr. Stařec vzhlédl před sebe a uviděl hejno divokých kachen, které se rýsovalo na obloze nad vodou, pak se zastřelo a opět se ostře rýsovalo, a poznal, že žádný člověk není na moři nikdy sám.\n")
        .append(
            "Pomyslel si, jak se někteří lidé bojí octnout se v malém člunu z dohledu země, a věděl, že mají pravdu v měsících, kdy přichází náhlá nepohoda. Ale teď bylo období hurikánů, a když se zrovna žádný hurikán nestrhne, jsou měsíce hurikánů nejlepší v celém roce.\n")
        .append(
            "Když má přijít hurikán, pozná to člověk podle známek na obloze celé dny předem -jestliže je na moři. Na souši to nepoznají, myslel si stařec, protože nevědí, po čem se mají dívat. Nad zemí se taky nejspíš mění tvar mraků. Ale teď se žádný hurikán nechystá.\n")
        .append(
            "Vzhlédl k obloze a viděl, jak se bílé kumuly kupí jako lákavé kopce zmrzliny, a vysoko nahoře se rýsovalo řídké pápeří cirrů na vyklenuté zářijové obloze.\n")
        .append(
            "\"Lehká brisa, \" poznamenal. \"Počasí mi přeje víc než tobě, rybo.\"\n")
        .append(
            "Levičku měl pořád ještě sevřenou křečí, ale pomalu si ji rozhýbával.\n")
        .append(
            "Nenávidím křeč, pomyslel si. To jako by člověka zradilo vlastní tělo. Člověka ponižuje před ostatními, když dostane průjem z otravy zkaženým jídlem nebo když z toho zvrací. Ale křeč - myslel na ni jako na calambre - poníží člověka zvlášť, když je sám.\n")
        .append(
            "Kdyby tu byl chlapec, mohl by mi ruku třít a rozehnat tu křeč od předloktí, říkal si v duchu. Ale však ona už povolí!\n")
        .append(
            "Pak ucítil pravičkou rozdíl v napětí šňůry a vzápětí si všiml, že se úhel šňůry s hladinou změnil. A potom, jak se opíral proti tahu a plácal si levičkou prudce a rychle o stehno, viděl, že se šňůra zvolna zvedá.\n")
        .append(
            "\"Vyplouvá!\" uvědomil si nahlas. \"Vzpamatuj se, ruko! Prosím tě se vzpamatuj!\"\n")
        .append(
            "Šňůra se zvedala zvolna a vytrvale a pak se hladina oceánu před člunem vzedmula a ryba se vynořovala ven. Vynořovala se nesmírně dlouho a voda stékala po jejích bocích. Leskla se ve slunci, hlavu a hřbet měla temně purpurové a pruhy na jejích bocích byly ve slunci široké a levandulově nafialovělé. Její meč byl dlouhý jako baseballová pálka a zužoval se jako rapír a ryba se vyhoupla z vody v celé své délce a znovu se do ní pohroužila, plavně jako potápěč, a stařec viděl, jak se potápí veliká kosa její ocasní ploutve, a pak se začala šňůra prudce odvíjet.\n")
        .append(
            "\"Je o dvě stopy delší než člun,\" pronesl stařec nahlas. Šňůra se odmotávala, rychle, ale rovnoměrně, a ryba nebyla zachvácena strachem. Stařec se snažil udržet šňůru oběma rukama, aby se nenapjala až k prasknutí. Věděl, že kdyby se mu nepodařilo zvolnit rychlost ryby stálým tahem, ryba by mohla odvinout celou šňůru a přetrhnout ji.\n")
        .append(
            "Je to veliká ryba, a já ji musím udolat, myslel si. Nesmím ji ani na chvíli nechat, aby si uvědomila svou sílu a co by dokázala, kdyby vyrazila k útěku. Kdybych byl na jejím místě, vynaložil bych teď všechnu sílu a vrhl bych se vpřed, až by něco prasklo. Ale ryby bohudíky nemají tolik rozumu jako my, kdo je zabíjíme, i když jsou ušlechtilejší a silnější.\n")
        .append(
            "Stařec už viděl hodně velkých ryb. Viděl hodně takových, které vážily přes pět metráků, a dvě nebo tři ryby těch rozměrů v životě ulovil, ale nikdy ne sám. A teď byl sám a z dohledu země a byl připoután k největší rybě, jakou kdy spatřil, k větší rybě, než o jaké kdy slyšel, a levou ruku měl pořád tak ztuhlou jako zaťatý orlí spár.\n")
        .append(
            "Však ta křeč povolí, myslel si. Určitě povolí, aby má levá ruka pomohla pravičce. Ty tři jsou teď jako sestry - ryba a obě mé ruce. Křeč musí povolit. Není důstojné dát se takhle ochromit křečí. Ryba opět zpomalila a plula svou obvyklou rychlostí.\n")
        .append(
            "Rád bych věděl, proč vyplula na povrch, pomyslel si stařec. Skoro jako by mi chtěla ukázat, jak je veliká. Aspoň to teď vím. Kdybych tak mohl ukázat já jí, jaký jsem vlastně člověk. Ale pak by viděla tu ochromenou ruku. Ať si myslí, že jsem chlapštější, než opravdu jsem, a já taky budu. Přál bych si být tou rybou, pomyslel si, a mít všechno, co má ona proti mé pouhé vůli a rozumu.\n")
        .append(
            "Pohodlně se zapřel o dřevo a snášel bez reptání trýzeň a ryba vytrvale plula a loďka se pomalu pohybovala v temné vodě. Větřík vanoucí od východu lehce rozvlnil moře a k polednímu křeč v starcově levičce povolila.\n")
        .append(
            "\"Máš to špatné, rybo,\" řekl stařec a o kousek pošoupl šňůru po pytlích, jimiž si chránil ramena.\n")
        .append(
            "Nestěžoval si, ale trpěl, i když si tu trýzeň vůbec nepřipouštěl.\n")
        .append(
            "\"Nejsem vůbec pobožný,\" pronesl nahlas. \"Ale odříkám deset Otčenášů a deset Zdrávasů, abych tuhle rybu dostal, a slibuje, že půjdu na pouť k Virgen de Cobre, když ji chytím. To slibuju.\"\n")
        .append(
            "Pustil se mechanicky do odříkávání modliteb. Chvílemi byl tak unaven, že si nemohl na slova modlitby vzpomenout, a pak ji rychle drmolil, aby se mu vybavila sama od sebe. Zdrávasy se říkají lip než Otčenáše, pomyslel si.\n")
        .append(
            ".\"Zdrávas Maria milosti plná, Pán s tebou. Požehnaná jsi mezi ženami a požehnaný plod života tvého, Ježíš. Svatá Maria, matko boží, pros za nás hříšné nyní i v hodině smrti naší. Amen.\" Pak dodal: \"Svatá Panno, oroduj za smrt téhle ryby! I když je taková báječná.\"\n")
        .append(
            "Když se pomodlil a dostal se do daleko lepší nálady - třebaže trpěl stále stejně a možná, že o něco víc -, opřel se o dřevěné pažení přídě a začal si mechanicky zpracovávat prsty levičky.\n")
        .append("Slunce teď pálilo, ačkoli vánek trochu sílel.\n")
        .append(
            "\"Měl bych znovu navnadit tu tenkou šňůru na zádi,\" řekl stařec. \"Jestli se ryba rozhodne, že to vydrží ještě jednu noc, budu muset něco sníst a voda v láhvi dochází. Myslím, že tady chytím leda dorádu. Ale když ji sním, dokud bude čerstvá, nebude to tak zlé. Kdyby mi tak v noci skočila do člunu létavá ryba! Jenže nemám světlo, abych je přivábil. Létavá ryba je za syrová výborná a nemusel bych ji ani krájet. Musím se teď stůj co stůj udržet při síle. Kristebože, já nevěděl, že je tak veliká!\"\n")
        .append(
            "\"Ale stejně ji dostanu,\" pokračoval. \"Ať je jak chce mohutná a velkolepá!\"\n")
        .append(
            "Třebaže to není spravedlivé, pomyslel si. Ale já jí ukážu, co dokáže a co snese člověk.\n")
        .append(
            "\"Povídal jsem chlapci, že jsem zvláštní staroch,\" řekl nahlas. \"Teď přišla chvíle, kdy to musím dokázat.\" Nezáleželo na tom, že to už dokázal tisíckrát. Teď to dokazoval znovu. Po každé to bylo jako po prvé a on nikdy nemyslil na minulost, když byl u díla.\n")
        .append(
            "Kdyby tak ryba usnula a já mohl spát a nechat si zdát o lvech, pomyslel si. Proč se mi zdá hlavně už jen o lvech? Nemudruj, staříku, řekl si v duchu. Opři se teď zlehka o pažení a nemysli na nic. Ryba se namáhá. Ty se namáhej, co můžeš nejmíň.\n")
        .append(
            "Sklánělo se k odpoledni a člun se stále pohyboval zvolna a rovnoměrně. Ale teď jej poháněl i východní větřík a stařec se mírně pohupoval na mělkých vlnách a snášel snadno a bez obtíží bolestivý tlak provazu přes hřbet.\n")
        .append(
            "Jednou během odpoledne se šňůra začala zase napínat. Ale to ryba jenom pokračovala v plavbě v hloubce o něco menší. Slunce se starci opíralo do levého ramene a do zad. Věděl tedy, že se ryba od severu stočila trochu na východ.\n")
        .append(
            "Teď, když už rybu uviděl, dovedl si ji představit, jak pluje ve vodě s purpurovými prsními ploutvemi, roztažený mi jako křídla, a jak svým velkým vztyčeným ocasem krájí temnotu. Rád bych věděl, jak asi v té hloubce vidí, pomyslel si. Má obrovské oči, a kůň, který má oči daleko menší, vidí ve tmě. Já jsem taky kdysi viděl ve tmě. Ne v naprosté tmě. Ale skoro tak jako kočka.\n")
        .append(
            "Slunce a vytrvalý pohyb prstů vyhnaly teď křeč z levičky úplně a on na ni začal přenášet více námahy z tahu a nahrbil svaly na zádech, aby pošinul bolestivý zářez provazce o kousek dál.\n")
        .append(
            "\"Jestli ještě nejsi unavená, rybo,\" řekl nahlas, \"musíš být něco docela zvláštního.\"\n")
        .append(
            "Sám teď cítil velkou únavu a věděl, že brzy padne noc, a pokoušel se přijít na jiné myšlenky. Myslel na velkou baseballovou ligu - pro něho to byla Gran Liga, a věděl, že Yankeeové z New Yorku hráli s Tygry z Detroitu.\n")
        .append(
            "Už druhý den nevím, jak dopadly juegos, pomyslel si. Ale musím doufat a musím být hoden slavného DiMaggia, který hraje naprosto dokonale, přes všechnu bolest z kostního výrůstku, z té ostruhy na patě. Co je to vlastně ostruha? Un espuela de hueso. My to nemíváme. Může to bolet tak, jako kdyby se někomu zaryla do paty ostruha zápasícího kohouta? Myslím, že bych takovou bolest nevydržel a že bych nedokázal přijít o jedno či obě oči a pokračovat v boji, jako to dělají kohouti při zápasech. Člověk nedokáže tak moc ve srovnání s velkými ptáky a zvířaty. Ale stejně bych radši byl tou velkou rybou tam dole v temnotách moře.\n")
        .append(
            "\"Až na to, kdyby přišli žraloci,\" pronesl nahlas. \"Kdyby přišli žraloci, smiluj se, Bože, nad ní i nade mnou!\"\n")
        .append(
            "Myslíš, že by velký DiMaggio vydržel s rybou tak dlouho jako já s touhletou? Já vím určitě, že ano, a ještě déle, protože je mladý a silný. A jeho táta byl taky rybář. Ale nebolela by ho moc ta kostní ostruha?\n")
        .append("\"To nevím,\" řekl nahlas. \"Já tu ostruhu nikdy neměl.\"\n")
        .append(
            "Když zapadalo slunce, vzpomněl si, aby si dodal sebevědomí, jak se tenkrát v hospodě v Casablance utkal v přetlačování rukou s tím slavným černochem ze Cienfuegos, a to byl nejsilnější muž v docích. Seděli tam celý den a noc s lokty na křídové čáře na stole, se vztyčeným předloktím a s rukama pevně zaklesnutýma do sebe. Jeden se snažil přetlačit ruku druhého, až by se dotkla stolu. Uzavírala se tam spousta sázek a lidé přicházeli a vycházeli z místnosti pod petrolejovými lampami a on pozoroval černochovu paži a ruku a jeho tvář. Po prvních osmi hodinách střídali rozhodčí v čtyřhodinových směnách, aby se mohli vyspat. Zpod jeho i černochových nehtů prýštila krev a hleděli si navzájem do očí a na ruce a na paže a sázkaři přicházeli dovnitř a vycházeli ven a posedávali na vysokých stoličkách u zdi a pozorovali je. Stěny byly dřevěné a natřené jasně modře a lampy na ně vrhaly jejich stíny. Černochův stín byl ohromný a houpal se po stěně, jak větřík rozkymácel lampy.\n")
        .append(
            "Celou noc se střídaly sázky pro a proti a černocha napájeli rumem a zapalovali mu cigarety. Pak se černoch po sklenici rumu pokusil o drtivý nápor a jednou starce, který tenkrát ještě nebyl stařec, ale Santiago El Campeón, vychýlil skoro o tři palce z rovnováhy. Ale stařec se vypracoval rukou zpátky do nerozhodné polohy. V té chvíli věděl s jistotou, že toho černocha, který byl znamenitý člověk a výborný atlet, už porazil. A za svítání, kdy sázkaři žádali, aby bylo utkání prohlášeno za nerozhodné a rozhodčí vrtěl hlavou, vynaložil veškeré úsilí a tlačil černochovu ruku níže a níže, až spočinula na dřevě. Utkání začalo v neděli ráno a skončilo v pondělí ráno. Mnoho sázejících žádalo o nerozhodný výsledek jen proto, že museli do práce v docích, nakládat pytle cukru nebo uhlí pro Havanskou uhelnou společnost. Jinak by byli chtěli všichni, aby se to vybojovalo až do konce. Ale on to skoncoval tak jako tak, dřív než ostatní museli do práce.\n")
        .append(
            "Dlouho potom mu všichni říkali šampión a na jaře pak měli odvetné utkání. Ale tenkrát se mnoho nesázelo a on vyhrál docela lehce, protože v prvním zápase podlomil černochovi ze Cienfuegos sebevědomí. Potom se utkal ještě párkrát a pak už vůbec ne. Usoudil, že by dokázal porazit každého, jen kdyby dost úporně chtěl, a že to škodí jeho pravé ruce pro rybaření. Zkusil několik cvičných utkání levičkou. Ale jeho levá ruka byla vždycky zrádná a nechtěla dělat, co na ní chtěl, a on k ní neměl důvěru.\n")
        .append(
            "Teď ji slunce jaksepatří vyhřeje, pomyslel si. Ta křeč by se už neměla objevit, ledaže bude v noci moc chladno. Rád bych věděl, co mi tahle noc přinese.\n")
        .append(
            "Nad hlavou mu přeletělo letadlo na cestě do Miami a stařec pozoroval jeho stín, jak plaší hejna létavých ryb. \"Při tolika létavých rybách by tu měly být dorády,\"řekl si stařec a zapřel se do šňůry, aby vyzkoušel, zda by ji nešlo proti tahu ryby zkrátit. Ale nešlo to a šňůra zůstala ztuha napjatá, drnčíc, až odletovaly krůpěje vody, jen jen prasknout. Člun plul zvolna vpřed a stařec pozoroval letadlo tak dlouho, dokud mu nezmizelo s očí.\n")
        .append(
            "To musí být zvláštní, letět v aeroplánu, pomyslel si. Jak asi moře z té výšky vypadá? Mohli by vidět docela dobře ryby, kdyby neletěli moc vysoko. Rád bych letěl hodně pomalu na dvě stě sáhů vysoko a díval se na ryby shora. Na lodích, které lovily želvy, jsem byl na nejvyšších ráhnech na vrcholku stěžně a i z té výšky jsem toho viděl hodně. Dorády odtamtud vypadají zelenější a člověk může vidět jejich pruhy a nachové skvrny a může přehlédnout celé plovoucí hejno. Proč vlastně všechny rychlé ryby z temných proudů mají purpurové hřbety a zpravidla purpurové pruhy nebo skvrny? Doráda je samozřejmě na pohled zelená, protože je ve skutečnosti nazlátlá. Ale když táhne za potravou a má opravdu hlad, objeví sejí na bocích purpurové pruhy. Vyvstanou ze vzteku nebo z toho, jak rychleji pluje?\n")
        .append(
            "Těsně před setměním, když míjeli velký ostrov z chaluh, které se zvedaly a klesaly v lehkém vlnění, jako by se oceán s někým miloval pod žlutou pokrývkou, zabrala na jeho tenkou šňůru doráda. Stařec ji uviděl po prvé, když vyskočila z vody, opravdu zlatá v posledních slunečních paprscích, a prohýbala se a mrskala sebou divoce ve vzduchu. Vyskakovala znovu a znovu v akrobatických přemetech strachu a stařec se namáhavě dostal na záď, skrčil se, podržel si velkou šňůru pravičkou a tahal dorádu levičkou, přidržuje vytaženou šňůru po každé přišlápnutím bosé levé nohy. Když ji dostal až k zádi člunu, přesto jak se snažila prudce se ponořit a jak se zoufale zmítala sem a tam, naklonil se stařec přes pažení a hodil zlatělesklou rybu s nachovými skvrnami do člunu. Její čelisti sebou křečovitě škubaly, jak rychle chňapala po háku, a její dlouhé zploštělé tělo bušilo do dna loďky, hlavou i ocasní ploutví. Stařec ji několikráte udeřil po lesklé hlavě, až se zachvěla a zůstala ležet tiše.\n")
        .append(
            "Stařec jí vyvlekl hák, navnadil jej jinou sardinkou a hodil šňůru přes pažení. Pak se zvolna doplížil zpátky na příď. Umyl si levou ruku a utřel si ji do kalhot. Pak si přendal těžkou šňůru z pravé ruky do levé a omýval si pravičku v moři, zatím co pozoroval, jak slunce zapadá do oceánu a pod jakým úhlem se šňůra noří do vln.\n")
        .append(
            "\"Vůbec se to nezměnilo,\" řekl. Ale kdy ž pozoroval, jak mu voda naráží na ruku, všiml si, že přece jen znatelně zpomalili.\n")
        .append(
            "\"Vzepřu obě vesla na zádi, a to ji v noci přibrzdí,\" řekl po chvíli. \"Je právě tak zralá k nočnímu odpočinku jako já.\"\n")
        .append(
            "Bylo by lepší vykuchat dorádu o něco později, aby v mase zůstala krev, pomyslel si. Udělám to až za chvíli a při tom zároveň vzepřu vesla, aby nás brzdila. Rybu bych teď měl radši nechat v klidu a nerušit ji při západu. Západ slunce je těžká chvilka pro každou rybu.\n")
        .append(
            "Nechal si ruku uschnout ve vzduchu, pak do ní vzal šňůru, jak jen mohl, uvolnil všechnu svaly a dal se přitáhnout dopředu na dřevěnou obrubeň, takže napětí se přenášelo na člun stejným dílem nebo ještě víc než na něho.\n")
        .append(
            "Učím se, jak na to, pomyslel si. Aspoň v tomhletom. A pak nesmím zapomenout, že ryba nejedla od té doby, co spolkla vnadidlo, a je obrovská a potřebuje spoustu potravy. Já jsem snědl celého bonita. Zítra sním dorádu. Možná, že bych z ní měl kousek sníst, až ji očistím. Jíst dorádu bude těžší než jíst tuňáka. Ale konec konců, nic není snadné.\n")
        .append(
            "\"Jak se cítíš, rybo?\" zeptal se nahlas. \"Já se cítím dobře a s levičkou to mám už lepší a mám co jíst na celou noc a den. Táhni člun, rybo!\"\n")
        .append(
            "Doopravdy se však dobře necítil, protože bolest od provazu, zařezávajícího se mu do zad, téměř překročila meze bolesti a proměnila se v tupý pocit, který mu byl podezřelý. Ale už jsem zažil horší věci, uklidňoval se v duchu. Ta odřenina na ruce není nic vážného a křeč v té druhé povolila. Nohy mám v pořádku. A jsem na tom lip než ona, pokud jde o stravu.\n")
        .append(
            "Bylo už tma, jak už se tak v září po západu slunce rychle stmívá. Stařec nalehl na povětřím ošlehané dřevo přídě a odpočíval, pokud to jen šlo. Vyšly první hvězdy. Neznal jménem hvězdu Rigel v souhvězdí Orion, ale viděl ji a věděl, že záhy vyjdou všechny a že bude se všemi svými vzdálenými přítelkyněmi.\n")
        .append(
            "\"Ryba je taky můj přítel,\" pronesl nahlas. \"Nikdy jsem takovou rybu ještě neviděl, ani jsem o takové neslyšel. Ale musím ji zabít. Jsem rád, že se nemusíme pokoušet zabíjet hvězdy.\"\n")
        .append(
            "Co kdyby se tak nějaký člověk musel snažit zabít každý den měsíc? Měsíc uteče. Ale co kdyby se tak někdo každý den musel pokusit zabít slunce? Narodili jsme se šťastně, pomyslel si.\n")
        .append(
            "Pak mu přišlo líto veliké ryby, která nemá co jíst, ale jeho odhodlání zabít ji ani na chvilku při té lítosti neochablo. Kolik lidí ta ryba nakrmí! říkal si v duchu. Ale jsou hodni, aby ji jedli? Ne, ovšemže nejsou. Nikdo není hoden toho, aby ji jedl, soudě podle jejího chování a její majestátní důstojnosti.\n")
        .append(
            "Nerozumím těmhle věcem, myslel si, ale je dobře, že se nemusíme snažit zabíjet slunce a měsíc a hvězdy. Stačí, že žijeme na moři a zabíjíme své věrné bratry.\n")
        .append(
            "Teď bych měl myslet na to přibrzdění, řekl si v duchu. Má to své výhody, ale je v tom i nebezpečí. Jestli je brždění vzepřenými vesly opravdu to pravé a člun ztratí všechnu lehkost, může ryba podniknout nápor a já bych mohl přijít o tolik šňůry, že bych přišel i o ni. Lehkost člunu sice prodlužuje naše trápení, ale zároveň je to pro mne při téhle rychlosti pojistka. Tak rychle zatím ještě ryba neplula. Ať se děje co děje, musím vykuchat dorádu, aby se nezkazila, a sníst z ní kousek, abych měl sílu.\n")
        .append(
            "Teď si ještě hodinku odpočinu a zjistím si, jestli bude tak rovnoměrně a vytrvale plout dál, a pak se teprv dostanu na záď, pustím se do práce a rozhodnu se. Zatím uvidím, co bude ryba dělat a jestli se na ní neprojeví nějaká změna. S těmi vesly je to dobrý trik, ale teď už je na čase zbytečně neriskovat. Má v sobě ještě pořád dost života a hák, jak jsem viděl, jí trčí z koutku huby a hubu má pevně semknutou. Ten hák ji zvlášť netrápí, to nic není. Všechno záleží na tom, že ji trápí hlad a že musí čelit něčemu, co nechápe. Odpočiň si, staříku, ať se zatím dře ona, než tě znovu zavolá povinnost!\n")
        .append(
            "Odpočíval, jak byl přesvědčen, asi dvě hodiny. Měsíc teď vycházel pozdě, takže neměl podle čeho odhadnout čas. A neodpočíval taky skutečně, leda ve srovnání s předchozí námahou. Stále ještě snášel na ramenou tlak šňůry, ale opřel se teď levičkou o pažení přídě a svěřoval odpor proti tahu ryby čím dál víc loďce samé.\n")
        .append(
            "Jak by to bylo jednoduché, kdybych mohl šňůru uvázat k člunu, pomyslel si. Ale ryba by ji mohla jedním malých škubnutím přetrhnout. Musím odpérovat napětí šňůry vlastním tělem a musím být každou chvíli připraven popustit šňůru oběma rukama.\n")
        .append(
            "\"Ale ještě jsi vůbec nespal, staříku,\" řekl si nahlas. \"Půl dne a noc a teď ještě jeden den, a tys nespal. Musíš si něco vymyslet, aby sis trochu zdříml, jestli bude ryba plout klidně a rovnoměrně. Jestli se neprospíš, nebudeš pak možná mít jasno v hlavě.\"\n")
        .append(
            "Mám v hlavě dost jasno, odpovídal si v duchu. Až moc jasno. Tak jasno, jako jsou jasné hvězdy, moje sestry. Ale přece jen musím spát. I hvězdy spí a měsíc a slunce spí, a dokonce i oceán někdy spí, v jistých dnech, kdy není žádný proud a hladina je plochá a klidná.\n")
        .append(
            "Nezapomeň se vyspat, přikazoval si. Přinuť se k tomu a vymysli si něco jednoduchého a jistého, co podniknout se šňůrami. Teď běž dozadu a připrav si dorádu. Přivázat vesla jako brzdu je příliš nebezpečné, když musíš spát.\n")
        .append(
            "Obešel bych se bez spánku, odporoval sám sobě. Ale bylo by to příliš nebezpečné.\n")
        .append(
            "Vydal se po rukou a po kolenou na cestu zpátky na záď, dávaje při tom pozor, aby nepoplašil rybu škubnutím. Možná že sama napůl spí, napadlo ho. Ale já nechci, aby si odpočala. Musí táhnout, až dodělá.\n")
        .append(
            "Když dolezl na záď, otočil se tak, že levičkou držel přes ramena napjatou šňůru, a pravačkou vytáhl z pochvy nůž. Hvězdy zářily, takže dorádu zřetelně rozeznal, vrazil jí čepel nože do hlavy a vytáhl ji zpod zadní paloubky. Stoupl si na ni jednou nohou a rozřízl ji rychle od řiti až po špičku spodní čelisti. Pak nůž odložil a pravačkou ji vyvrhl, čistě celý vnitřek vybral a vytrhal žábry. Cítil v rukou těžký a kluzký žaludek a rozřízl jej. Našel v něm dvě létavé ryby. Byly čerstvé a tvrdé. Položil je jednu vedle druhé a vyhodil vnitřnosti a žábry přes záď. Potopily se, zanechávajíce po sobě ve vodě světélkující stopu. Doráda byla studená a nyní ve svitu hvězd leprovitě šedobílá, a stařec jí stáhl po jedné straně kůži, přidržuje si rybí hlavu pravou nohou. Pak ji obrátil, stáhl ji na druhé straně a odkrojil obě půlky od hlavy až k ocasu.\n")
        .append(
            "Pustil zbytek těla přes pažení a podíval se, jestli to ve vodě zavíří. Ale viděl jen světélkování, jak tělo pozvolna klesalo. Pak se otočil, vložil obě létavé ryby mezi řízky rybího masa, strčil nůž do pochvy a doplazil se pomalu zpátky na příď. Hřbet měl ohnuty tlakem šňůry a rybu nesl v pravačce.\n")
        .append(
            "Na přídi pak rozložil oba rybí řízky na paloubku a létavé ryby položil vedle nich. Nato si posunul šňůru přes rameno na dosud neotlačené místo a přidržoval ji opět levou rukou, opřenou o pažení. Pak se vyklonil přes obrubeň a opláchl létavé ryby ve vodě, při čemž pozoroval, jak rychle se mu voda rozráží o ruku. Ruka fosforeskovala od toho, jak stahoval rybu, a on pozoroval proudění vody kolem ní. Proudění už nebylo tak silné, a když si ruku třel o bok loďky, stíraly se s ní částečky fosforu a odplývaly zvolna k zádi.\n")
        .append(
            "\"Ryba je buďto unavená nebo odpočívá,\" promluvil stařec. \"Teď si musím odbýt jídlo a trochu si oddechnout a zdřímnout si.\"\n")
        .append(
            "Ve svitu hvězd a v stále rostoucím nočním chladu snědl polovinu jednoho řízku z dorády a jednu létavou rybu, kterou vykuchal a uřízl jí hlavu.\n")
        .append(
            "\"Jak znamenitá ryba je doráda, když je uvařená,\" řekl si. \"A jak mizerná, když je syrová. Nikdy už nevyjedu na moře bez soli nebo bez citronů.\"\n")
        .append(
            "Kdybych měl kouska rozumu, byl bych šplíchal na paloubku celý den vodu, aby vyschla, a zbyla by sůl, vyčítal si. Ale vždyť jsem vlastně tu dorádu chytil až těsně před západem. Jenže jsem se na to stejně pořádně nepřipravil. Ale rozžvýkal jsem ji dobře a nezvedá se mi žaludek.\n")
        .append(
            "Obloha se směrem k východu zatahovala a známé hvězdy mu jedna po druhé mizely. Vypadalo to teď, jako by plul hlubokým kaňonem mraků, a vítr opadl.\n")
        .append(
            "\"Za tři nebo za čtyři dny přijde špatné počasí,\" řekl si nahlas. \"Ale ne dnes ani zítra. Zařiď si to teď, aby ses trochu vyspal, staříku, když ryba zatím pluje klidně a pravidelně!\"\n")
        .append(
            "Sevřel šňůru pevně pravou rukou a pak se k pravičce přitiskl stehnem, opíraje se veškerou vahou o prkna přídě. Pak si posunul šňůru na ramenou o něco níže a chytil sejí levičkou.\n")
        .append(
            "Pravička šňůru udrží, dokud si ji podepírám. Kdyby se ve spánku uvolnila, levá ruka mě vzbudí, až bude šňůra klouzat ven. Pro pravou ruku je to těžká zkouška. Ale na to je už zvyklá. I dvacet minut nebo půlhodinka spánku mi bude dobrá. Lehl si dopředu, křečovitě se celým tělem přitiskl na šňůru, nalehl veškerou vahou na pravičku a usnul.\n")
        .append(
            "Nezdálo se mu o lvech, ale o nesmírném hejnu plískavic, které se táhlo na dvanáct či patnáct kilometrů. Bylo to v době páření a plískavice vyskakovaly vysoko do povětří a dopadaly zpátky do téže díry, kterou svým skokem ve vodě vyhloubily.\n")
        .append(
            "Pak se mu zdálo, že je doma ve vesnici v posteli, že fouká prudký severák, že je mu velmi zima a že mu zdřevěněla pravá paže, protože si ji podložil pod hlavu místo polštáře.\n")
        .append(
            "Nato se mu začalo zdát o dlouhém žlutém pobřeží a viděl ve snu, jak na ně v časném soumraku sestoupil první lev, a pak se začali objevovat ostatní lvi a on si podepřel bradu o pažení přídě na plachetnici, zakotvené ve večerním větříku z pevniny, a čekal, jestli se objeví ještě další lvi, a byl šťasten.\n")
        .append(
            "Měsíc už dávno vyšel, ale on spal dál a ryba dál vytrvale táhla a člun vplul do tunelu v mracích.\n")
        .append(
            "Probudil se úderem své pravé pěsti, která se mu vymrštila do tváře, a pálením šňůry, která mu drhla v dlani. Levou rukou ji necítil, ale sevřel ji ze všech sil pravou, a šňůra mu v ní uháněla pryč. Konečně ji nahmatal levičkou, vzepřel se proti tahu a teď mu šňůra spalovala záda a levou ruku, a levička na sebe vzala všechnu námahu a provaz se do ní zle zařezával. Ohlédl se na kotouče šňůry, a ty se hladce odmotávaly. V tom okamžiku ryba skočila, mocně rozrazila oceán a pak těžce dopadla. A pak skočila ještě jednou a ještě, a člun se rozletěl, třebaže se šňůra stále prudce odvíjela a stařec zvyšoval znovu a znovu její napětí až k prasknutí. Strhlo ho to a přitisklo dolů k přídi, tvář měl v nakrojeném řízku dorády a nemohl se pohnout.\n")
        .append(
            "Na tohle jsme čekali, pomyslel si. Tak se s tím teď vypořádejme!\n")
        .append(
            "Za tu šňůru mi musí zaplatit, umiňoval si v duchu. To mi musí zaplatit!\n")
        .append(
            "Neviděl, jak ryba skáče, slyšel jenom, jak prudce rozhrnuje oceán, a její těžká šplouchnutí při dopadu. Rychle se odvíjející šňůra se mu bolestivě zařezávala do rukou, ale to on celou tu dobu předem očekával. Snažil se teď udržet ji na mozolnatých částech ruky, aby mu nesklouzla do měkkého středu dlaně nebo mu nepořezala prsty.\n")
        .append(
            "Kdyby tady byl chlapec, namočil by kotouče vodou, prolétlo mu hlavou. Ano. Kdyby tady byl chlapec! Kdyby tady byl chlapec!\n")
        .append(
            "Šňůra utíkala a utíkala, ale její běh se už zpomaloval a stařec nutil rybu, aby si každý coul vybojovala. Teď se mu podařilo zvednout hlavu od paloubky a z řízku ryby, který tváří rozmačkal. Pak si klekl a potom se pomalu postavil na nohy. Popouštěl šňůru, ale stále a stále pomaleji. Ucouvl dozadu, kde mohl nohou nahmatat kotouče, na které neviděl. Měl pořád ještě dost šňůry a ryba teď musela přemáhat tření veškeré odvinuté šňůry ve vodě.\n")
        .append(
            "Tak, pomyslel si. Teď vyskočila aspoň tucetkrát, naplnila si hřbetní měchýře vzduchem a nemůže se ponořit k poslednímu tažení do hloubky, odkud bych ji nevytáhl. Za chvíli začne kroužit v obloucích a pak ji musím zkrotit. To bych rád věděl, co ji to tak najednou popadlo? Zoufala si z hladu, nebo se lekla něčeho ve tmě? Možná že najednou dostala strach. Ale byla taková klidná a silná a zdála se tak nebojácná a sebevědomá. Je to divné.\n")
        .append(
            "\"Buď radši nebojácný a sebevědomý ty sám, staříku!\" promluvil sám k sobě. \"Držíš ji zase pevně, ale nemůžeš zkrátit šňůru. A ona začne co nevidět kroužit.\"\n")
        .append(
            "Teď stařec udržoval rybu levičkou a rameny, shýbl se, nabral vodu do pravičky a omýval si s obličeje rozmačkané maso dorády. Měl strach, že by se mu z něho mohlo udělat špatně, že by zvracel a že by tak zeslábl. Když měl tvář čistou, omyl si pravičku a nechal ji spuštěnou přes pažení ve slané vodě, zatím co pozoroval první úsvit před východem slunce. Míří skoro přímo na východ, pomyslel si. To znamená, že je unavená a plave s proudem. Co nevidět bude přede mnou muset začít kroužit. A pak začne opravdová práce.\n")
        .append(
            "Když usoudil, že si pravičku vymáchal dostatečně, vytáhl ji z vody a podíval se na ni.\n")
        .append(
            "\"Není to tak zlé,\" promluvil. \"A na bolesti muži nezáleží.\"\n")
        .append(
            "Uchopil opatrně šňůru, aby mu nikde nepřišla do čerstvých zářezů, a přesunul váhu těla tak, že mohl ponořit na druhé straně člunu do moře levičku.\n")
        .append(
            "\"Na takovou budižkničemu ses nedržela zrovna nejhůř,\" oslovil ji. ;,Ale v jedné chvíli jsem nevěděl, kde tě vůbec mám.\"\n")
        .append(
            "Proč jsem se nenarodil s oběma rukama v pořádku? uvažoval v duchu. Snad jsem udělal chybu, že jsem tu levou pořádně netrénoval. Ale pánbůh ví, že měla dost příležitosti, aby se pocvičila. Pravda, v noci si nevedla zrovna špatně a jenom jednou dostala křeč. Jestli ji dostane ještě jednou, ať mi ji radši šňůra uřízne!\n")
        .append(
            "Uvědomil si při takových úvahách, že nemá docela jasno v hlavě, a napadlo ho, že by měl sežvýkat ještě kousek dorády. Ale to nemůžu, řekl si pro sebe. Radši ať se mi točí hlava, než přijít o sílu slabostí od žaludku. Vím, že bych od té chvíle, co jsem měl v tom mase obličej, v sobě sousto neudržel. Nechám si ji pro nejhorší případ, dokud se nezkazí. Ale je už stejně pozdě chtít načerpat síly z jídla. Jsi hlupák, namítal si. Sněz tu druhou létavou rybu!\n")
        .append(
            "Ležela tu, očištěná a připravená, a on ji zvedl levičkou a pustil se do ní, žvýkaje pečlivě kosti, a snědl ji celou až k ocasu.\n")
        .append(
            "Je výživnější než většina všech ostatních ryb, myslel si přitom. Při nejmenším z ní jde zrovna ten druh síly, jakou teď potřebuju. A teď jsem udělal všechno, co jsem mohl, ujistil se pak. Teď může začít kroužit, teď může začít boj!\n")
        .append(
            "Slunce vycházelo po třetí od chvíle, co vyplul na moře, když se ryba dala do kroužení v obloucích před člunem.\n")
        .append(
            "Podle sklonu šňůry její kroužení vidět nemohl. Na to bylo příliš časně. Ucítil pouze, že se napětí šňůry trošičku zmírnilo, a začal ji pravičkou nenásilně přitahovat k sobě. Jako obvykle se napjala, ale povolila zrovna v okamžiku, kdy už měla blízko k prasknutí. Smekl si ji přes hlavu s ramenou a začal ji vytrvale a lehce soukat do člunu. Střídal v tahu houpavě obě ruce a snažil se táhnout co možná tělem a nohama. Staré nohy a ramena se mu přitom otáčely sem a tam jako obrtlík.\n")
        .append(
            "\"Nabrala si pořádně velký kruh,\" promluvil nahlas. \"Ale krouží.\"\n")
        .append(
            "Pak už se najednou šňůra nedala přitáhnout a stařec ji držel napjatou, až viděl, jak od ní ve slunci odskakují kapičky. A pak se začala odvíjet a stařec si klekl a řevnivě ji popouštěl zpátky do temné vody.\n")
        .append(
            "\"Dostala se teď do nejvzdálenějšího ohbí,\" řekl si nahlas. Musím ji držet ze všech sil, pomyslil si na to. Po každé jí tím tahem kruh o něco zkrátím. Za takovou hodinku ji možná uvidím. Teď ji musím zkrotit a pak ji musím zabít.\n")
        .append(
            "Ale ryba pokračovala v pomalém kroužení a stařec byl po dalších dvou hodinách mokrý potem a zmožený únavou až do morku kostí. Jenže kruhy teď byly daleko kratší a z úhlu, který svírala šňůra s hladinou, mohl zjistit, že ryba pluje stále blíž a blíž při povrchu.\n")
        .append(
            "Dobrou hodinu viděl stařec černé mžitky před očima, pot ho slaně pálil v odřenině nad okem a na čele. Z černých mžitek strach neměl. Při tom úsilí, s jakým přitahoval šňůru, byly obvyklé. Ale dvakrát ho obešla mdloba, a závrať, a to ho zneklidnilo.\n")
        .append(
            "\"Nesmím přece zklamat sám sebe a umřít při takovéhle rybě,\" řekl si nahlas. \"Panebože, pomoz mi vydržet, teď když mi to s ní jde tak krásně! Pomodlím se sto Otčenášů a sto Zdrávasů. Ale teď to nejde.\"\n")
        .append(
            "Mysli si, že jsem seje pomodlil, dodal v duchu. Pomodlím seje potom.\n")
        .append(
            "Právě v tom okamžiku ucítil náhlé škubání a cukání šňůry, kterou držel oběma rukama. Přišlo to ostře a tvrdě a těžce.\n")
        .append(
            "Pustila se svým mečem do drátěného nástavce, pomyslel si stařec. To se dalo čekat. Musela to udělat. Ale mohla by z toho začít skákat a já bych byl radši, kdyby zůstala kroužit. Ty skoky předtím byly nutné, aby do sebe nabrala vzduch. Ale teď může každý skok rozšířit ránu, a mohla by se s háku utrhnout.\n")
        .append(
            "\"Neskákej, rybo!\" zaklínal ji nahlas. \"Neskákej!\" Ryba udeřila o drát ještě několikrát a po každé, když pohodila hlavou, popustil stařec o kousek šňůru.\n")
        .append(
            "Nesmím dovolit, aby si působila další bolest, říkal si v duchu. Na mé bolesti nesejde. Tu zvládnu. Ale ona by mohla bolestí začít zuřit.\n")
        .append(
            "Po chvíli přestala ryba bušit do drátu a pustila se znovu do pomalého kroužení. Teď stařec soukal šňůru vytrvale k sobě. Ale přišlo mu zase mdlo. Nabral levičkou trochu mořské vody a šplíchl si ji na hlavu. Pak se pošplíchal ještě víc a promnul si zátylek.\n")
        .append(
            "\"Křeče nemám,\" řekl si nahlas. \"Ryba se co nevidět vynoří a nějak to vydržím. Musíš to vydržet. Ani o tom nemluv!\"\n")
        .append(
            "Opřel se vkleče o příď a přehodil si na chvíli šňůru zase přes záda. Odpočinu si, než vykrouží kruh směrem od loďky, a pak, až se zase přiblíží, vstanu a pustím se do ní, rozhodl se.\n")
        .append(
            "Silně ho pokoušelo odpočívat na přídi a nechat rybu obeplout celý kruh bez přitažení šňůry. Ale když napětí šňůry ukázalo, že se ryba otočila a pluje zpátky ke člunu, stařec vstal a zase začalo natáčení jako na obrtlíku a houpavé potahování, kterým soukal vydobyté metry šňůry dovnitř.\n")
        .append(
            "Tak utahaný jsem ještě v životě nebyl, pomyslil si, a začíná se zdvíhat pasát. Ale ten mi poslouží, abych dostal rybu do přístavu. Moc toho mám zapotřebí.\n")
        .append(
            "\"Odpočinu si, až se teď zase pustí od loďky,\" prohlásil pak. \"Je mi teď o hodně lip. A za nějaké dvě nebo tři hodiny ji dostanu.\"\n")
        .append(
            "Slamák měl pošinutý daleko na zátylek a sklesl na příď tahem šňůry, když cítil, jak se ryba obrací od něho.\n")
        .append(
            "Teď pracuj ty, rybo! řekl si v duchu. Já se tě ujmu, až se budeš vracet.\n")
        .append(
            "Moře se začalo povážlivě dmout. Ale byla to brisa, která ukazovala na pěkné počasí, a stařec ji potřeboval, aby se dostal zpátky domů.\n")
        .append(
            "\"Budu prostě kormidlovat na jihozápad,\" umiňoval si. \"Člověk se na moři nikdy neztratí a náš ostrov je pořádně dlouhý.\"\n")
        .append("Při třetí obrátce rybu po prvé uviděl.\n")
        .append(
            "Uviděl ji nejprve jako temný stín, jemuž trvalo tak dlouho, než proplul pod člunem, že jeho délce nemohl uvěřit.\n")
        .append("\"Ne,\" prohlásil hlasitě. \"Tak veliká být nemůže.\"\n")
        .append(
            "Ale byla tak veliká, a když dokončila tenhle okruh, vynořila se k hladině ve vzdálenosti pouhých třiceti metrů a stařec viděl její ocasní ploutev vyčnívat z vody. Byla vyšší než veliká kosa a odrážela se bleděfialovělou levandulovou barvou od temněmodré vody. Vyčnívala v šikmém úhlu nad hladinu, a jak ryba plula těsně při povrchu, stařec viděl její obrovsky objem a temněfialové pruhy na jejích bocích. Hřbetní ploutev měla sklopenou a ohromné prsní ploutve do široka roztažené.\n")
        .append(
            "Při tomto okruhu viděl stařec její oko a dva šedivé příssavné štítonoše, kteří plavali kolem ní. Občas se k ní přissáli, občas od ní vystřelili jako šipky, chvílemi pluli lehce v jejím stínu. Oba byli přes metr dlouzí, a když plavali, svíjelo se jim celé tělo jako úhořům.\n")
        .append(
            "Stařec se teď potil, ale nejen od slunce, při každé klidné a hladké obrátce, kterou ryba udělala, zkracoval šňůru a byl si jist, že po dalších dvou obrátkách bude mít příležitost harpunovat ji.\n")
        .append(
            "Ale musím se k ní dostat těsně, docela těsně, opakoval si v duchu. Nesmím se snažit zasáhnout ji do hlavy. Musím do srdce.\n")
        .append("\"Jen klid a sílu, staříku!\" povzbudil se nahlas.\n")
        .append(
            "Při příštím okruhu se rybě vynořil hřbet, ale bylo to trochu příliš daleko od člunu. Při následujícím okruhu byla ještě stále příliš daleko, ale vynořovala se víc z vody a stařec si byl jist, že když ještě o něco zkrátí šňůru, dostane ji po bok loďky.\n")
        .append(
            "Už dávno předtím si připravil harpunu, její lehké lanko bylo svinuto v kulatém košíku a na konci přivázáno k ouvazníku na přídi.\n")
        .append(
            "Ryba se teď ve svém kroužení blížila, vypadala klidně a krásně a jenom veliká ocasní ploutev se jí pohybovala. Stařec vší silou zatáhl, aby ji dostal blíž. Na kratičký okamžik se ryba naklonila trochu na bok. Pak vyrovnala a pustila se do dalšího okruhu.\n")
        .append(
            "\"Pohnul jsem s ní,\" řekl si stařec nahlas. \"Přece jsem s ní pohnul!\"\n")
        .append(
            "Pocítil opět nával mdloby, ale visel na obrovské rybě, co měl síly. Pohnul jsem s ní, opakoval si v duchu. Možná, že teď ji převrátím.Táhněte, ruce! Držte, nohy! Hlavo, vydrž! Udělej mi to kvůli! Nikdy jsi mě nezklamala. Tentokrát ji převrátím na bok!\n")
        .append(
            "Když však sebral všechny síly, opřel se do toho o hodně dřív, než ryba proplula kolem člunu, a táhl, div mu svaly nepraskly, ryba se dala o něco strhnout, ale pak vyrovnala a plula pryč.\n")
        .append(
            "\"Rybo,\" oslovil ji stařec. \"Rybo, vždyť stejně umřeš. Musíš přitom zabít i mne?\"\n")
        .append(
            "Takhle nic nedokážu, napadlo ho. Měl v ústech příliš vyschlo, aby promluvil nahlas, ale pro vodu teď nemohl sáhnout. Musím ji dostat po bok loďky tentokráte, umiňoval si v duchu. Moc už těch obrátek nevydržím. Ale vydržíš! okřikl sám sebe. Vydržíš to do nekonečna.\n")
        .append(
            "Při příští obrátce ji skoro dostal. Ale ryba zase vyrovnala a pomalu odplouvala pryč.\n")
        .append(
            "Zabíjíš mě, rybo, pomyslel si. Ale máš na to právo. Nikdy jsem neviděl většího obra, nic tak krásného a klidného a vznešeného, jako jsi ty, bratře. Tak pojď a zabij mě! Je mi jedno, kdo zabije koho.\n")
        .append(
            "Teď se ti to začíná v hlavě plést, napomenul se v duchu. Hlavu si musíš zachovat jasnou. Mysli jasně a dokaž, že umíš trpět jako muž! Nebo jako ryba, dodal pro sebe.\n")
        .append(
            "\"Vzpamatuj se, hlavo!\" pronesl hlasem sotva slyšitelným. \"Vzpamatuj se!\"\n")
        .append("Při dvou dalších obrátkách to dopadlo stejně.\n")
        .append(
            "Už nevím, říkal si stařec v duchu. Po každé užuž cítil, že ztrácí vědomí. Už nevím. Ale zkusím to ještě jednou.\n")
        .append(
            "Zkusil to ještě jednou, a když rybu obracel, cítil, že omdlévá. Ryba vyrovnala a opět pomalu odplouvala a její velká ocasní ploutev sebou mrskala ve vzduchu.\n")
        .append(
            "Zkusím to znovu, sliboval si stařec, třebaže mu připadalo, jako by měl ruce z rosolu, a viděl pořádně jen v záblescích.\n")
        .append(
            "Zkusil to znovu a dopadlo to stejně. Tak tedy, zadal zuby a cítil, že ztrácí vědomí, ještě než začal, tak to zkusím ještě jednou.\n")
        .append(
            "Sebral veškerou svou bolest a zbytek svých sil a svou dávno ztracenou hrdost a postavil je proti smrtelné úzkosti ryby a ryba se převrátila na bok a plula mírně na boku, dotýkajíc se téměř svým mečovitým výrůstkem bednění loďky, a začala míjet člun, dlouhá, nořící se do hloubky a široká, stříbrná a temně purpurově pruhovaná a ve vodě zdánlivě nekonečná.\n")
        .append(
            "Stařec pustil šňůru, stoupl na ni nohou, zdvihl harpunu, jak jen mohl vysoko, a veškerou silou, kterou v sobě právě zburcoval, ji vrazil rybě do boku těsně za ohromnou hrudní ploutev, která trčela do vzduchu do výše jeho hrudníku. Cítil, jak železo vniká dovnitř, a nalehl na ně, aby je vrazil hlouběji, a potom se na ně vrhl celou svou vahou.\n")
        .append(
            "Tu ryba ožila, cítíc v sobě smrt, a vyhoupla se vysoko z vody a vystavila se na odiv v celé nesmírné délce a šířce a ve vší své mohutnosti a kráse. Zdálo se, že visí ve vzduchu nad starcem v loďce. A pak dopadla do vody s drtivým plesknutím, které postříkalo starce i celou loďku vodním popraškem.\n")
        .append(
            "Starci se udělalo mdlo a zle a dobře neviděl. Ale uvolnil provazec harpuny a popouštěl jej zvolna rukama odřenýma do živého masa, a když mu oči zase začaly sloužit, spatřil, že ryba pluje na zádech se stříbrným břichem vzhůru. Násada harpuny jí trčela šikmo z boku a moře se barvilo rudou krví z jejího srdce. Nejprve to vypadalo jako mělčina pod hladinou azurové vody, která byla hluboká více nežli míli. Pak se to rozestřelo jako mrak. Ryba byla stříbřitá a nehybná a pohupovala se na vlnách.\n")
        .append(
            "Stařec si ji pozorně prohlédl v záblesku, kdy se mu vrátil zrak.\n")
        .append(
            "Pak omotal lanko harpuny dvakrát kolem ouvazníku na přídi a složil hlavu do dlaní.\n")
        .append(
            "\"Musím si zachovat jasnou hlavu,\" mumlal do dřeva přídě. \"Jsem unavený starý člověk. Ale zabil jsem tuhle rybu, svého bratra, a teď se musím dát do sprosté otročiny.\"\n")
        .append(
            "Musím přichystat smyčky a provaz, abych ji přivázal po bok loďky, uvažoval. I kdybychom byli dva a kdybychom nabrali do člunu vodu, abychom ji naložili, a pak vodu zas vybrali, do tohohle člunu by se nikdy nevešla. Musím si všechno připravit a pak ji přitáhnout a dobře přivázat a vztyčit stěžeň a napnout plachtu na cestu domů.\n")
        .append(
            "Začal přitahovat rybu k boku loďky, aby jí mohl provléci provaz žábrami a hubou a připoutat jí tak hlavu k přídi. Chci se na ni podívat zblízka, pomyslel si, a dotknout se jí a ohmatat si ji. Je mým jediným bohatstvím. Ale proto se jí dotknout nechci. Myslím, že jsem cítil její srdce. Když jsem po druhé nalehl na harpunu. Teď ji přitáhnu a přivážu a navleču jí smyčku kolem ocasu a ještě jednu kolem těla uprostřed, abych ji připoutal k loďce.\n")
        .append(
            "\"Do práce, staříku!\" poručil si. Lokl si maličko vody. \"Zbývá ti spousta otročiny, teď, když je po boji.\" Vzhlédl k nebi a pak se podíval na svou rybu. Starostlivě se zadíval na slunce. Není o moc víc než poledne, pomyslel si. A zdvíhá se pasát. Na šňůrách teď vůbec nezáleží. Spojíme je s chlapcem, až se vrátíme domů.\n")
        .append(
            "\"Tak pojď, rybo!\" řekl nahlas. Ale ryba nešla. Převalovala se místo toho ve vlnách a stařec přitáhl loďku k ní.\n")
        .append(
            "Když k ní přirazil a její hlava se octla vedle přídě, nemohl jejím rozměrům uvěřit. Ale odvázal lanko harpuny od ouvazníku, provlékl je rybě žábrami a mezi čelistmi, omotal je kolem jejího meče a provlekl je druhým žaberním otvorem, udělal ještě jednu smyčku kolem mečovitého výrůstku, zauzlil provaz na dvojito a upevnil jej k ouvazníku na přídi. Pak lanko přeřízl a šel na záď, aby přichytil smyčkou ocas. Ryba, dříve stříbrná a tmavěpurpurová, nyní zestříbřela a pruhy dostaly týž bleděfialový odstín jako její ocas. Byly širší než mužská ruka s roztaženými prsty a rybí oko zíralo tak lhostejně jako zrcadla v periskopu nebo jako oči svatých při procesí.\n")
        .append(
            "\"Byl to jediný způsob, jak ji zabít,\" prohlásil stařec. Co se napil vody, bylo mu lip a věděl, že nezajde, a hlavu měl jasnou. Váží takhle dobrých sedm set kilo, uvažoval. Jestli ne o hodně víc. Co když dvě třetiny z toho se dají počítat na maso po šedesáti centech za kilo?\n")
        .append(
            "\"Na to bych potřeboval tužku,\" řekl si nahlas. \"Nemám přece jen tak jasnou hlavu. Ale myslím, že slavný DiMaggio by na mě byl dneska pyšný. Nikdy jsem sice neměl kostní ostruhu. Ale ruce a hřbet mě bolí jaksepatří.\" Chtěl bych vědět, co to vlastně je ta kostní ostruha, uvažoval dál v duchu. Možná,že je máme a ani o tom nevíme.\n")
        .append(
            "Přivázal rybu k přídi a k zádi a k veslařské lavičce uprostřed. Byla tak veliká, že mu to připadalo, jako by si k boku připoutával mnohem větší člun. Uřízl kus šňůry a přivázal rybě spodní čelist kolem jejího meče, aby se jí neotvírala huba a aby pluli tak hladce, jak to jen půjde. Pak vztyčil stěžeň, dal na místo klacek, který mu sloužil za vratiráhno, narovnal ráhno, záplatovaná plachta se vzedmuta, člun se dal do pohybu a stařec, napůl leže na zádi, vyplul k jihozápadu.\n")
        .append(
            "Nepotřeboval kompas, aby poznal, kde je jihozápad. Stačilo mu cítit pasátní vítr a pozorovat dmutí plachty. Měl bych navnadit malou šňůru lžicovitou třpytkou a pokusit se ulovit něco k jídlu a svlažit si trochu chřtán. Ale nemohl třpytku najít a sardinky se mu všechny zkazily. Vylovil tedy hákem bodce chumáč žlutých chaluh, které pluly kolem, a vytřásl z nich na paloubku člunu drobné racky garnáty. Bylo jich přes tucet a vyskakovali a hemžili se jako písečné blechy. Stařec jim uštipoval palcem a ukazováčkem hlavičky a jedl je tak, že je rozžvýkal i se skořápkami a s ocásky. Byli droboučcí, ale věděl, že jsou výživní, a chutnali dobře.\n")
        .append(
            "Měl v láhvi ještě dva doušky vody a jeden z poloviny vypil, j akmile snědl garnáty. Na tak velké zatížení plul člun docela dobře a stařec jej řídil s rukojetí kormidla v podpaží. Viděl na rybu a stačilo mu podívat se na ruce a přitlačit hřbet k pažení, aby se přesvědčil, že se to všechno skutečně stalo a že to nebyl sen. Jednu chvíli před koncem, když mu bylo tak špatně, ho napadlo, že se mu to možná zdá. A když potom viděl, jak se ryba vyhoupla z vody a utkvěla nehnutě na obloze, nežli dopadla zpátky, byl si jist, že se děje něco krajně podivného, a nemohl tomu uvěřit. A pak nějaký čas pořádně neviděl, třebaže teď viděl zase tak dobře jako kdy jindy.\n")
        .append(
            "Teď věděl, že ryba je s ním, a jeho vlastní ruce a hřbet nebyly z žádného snu. Ruce se mi brzo zacelí, pomyslel si. Krvácení rány vyčistilo a slaná voda je zahojí. Temná voda ze srdce Golfského proudu je nejlepší balzám na světě. Jen si musím udržet jasnou hlavu. Ruce udělaly své a s plachtou se nám pluje dobře. Když má můj marlin zavřenou hubu a ocas kolmo do vody, plujeme si jako bratři. Pak se mu to v hlavě začalo trochu plést a napadlo ho : veze domů on mne nebo já jeho? Kdybych ho měl za sebou ve vleku, tak bych se ptát nemusel. A kdyby byl marlin v loďce a ztratil všechnu důstojnost, nemusel bych se ptát taky. Ale takhle pluli připoutáni k sobě, bok po boku, a stařec si myslel: ať doveze domů on mne, jestli mu to dělá radost. Zvítězil jsem nad ním jenom uskokem a on mi nechtěl ublížit.\n")
        .append(
            "Pluli dobře a stařec si máčel ruce ve slané vodě a snažil se udržet si jasnou hlavu. Vysoko nad nimi se hromadily oblačné kupy a táhly lehké beránky, takže stařec věděl, že brisa vytrvá celou noc. Díval se v jednom kuse na rybu, aby se ujistil, že je to všechno pravda. To bylo hodinu předtím, než ho napadl první žralok.\n")
        .append(
            "Ten žralok se neobjevil náhodou. Vyplaval už dříve z vodních hlubin, jakmile se temné mračno krve sesedlo a rozptýlilo v míli hlubokém moři. Vyřítil se nahoru tak rychle a tak naprosto bezhlavě, že prorazil hladinu modré vody a octl se ve slunci. Pak padl zpátky do moře, zachytil pach a vyrazil ve sledu člunu a ryby.\n")
        .append(
            "Občas ten pach ztratil. Ale zvětřil jej opět nebo zachytil aspoň jeho slabou stopu a hnal se prudce tím směrem. Byl to velmi veliký žralok mako, utvářený tak, aby se rychlostí vyrovnal nejrychlejším rybám v moři, a všechno na něm bylo krásné, až na jeho čelisti. Hřbet měl modrý jako mečouni, břicho stříbřité a kůži hladkou a pěknou. Tělem se podobal mečounovi, až na obrovité čelisti, které měl teď pevně semknuty, když rychle plaval těsně pod hladinou a vysokou hřbetní ploutví protínal vodu v nechvějící se přímce. Za stisknutými pysky měl v dásních všech osm řad zubů zahnutých směrem dovnitř. Nebyly to obyčejné jehlancovité zuby, jako má většina žraloků. Měly tvar jako lidské prsty zkřivené do drápů. Byly skoro tak dlouhé jako prsty starcovy a po obou stranách měly ostří nabroušené jako břitvu. Tahle ryba byla stvořena k tomu, aby jí sloužily za potravu všechny mořské ryby, které byly tak rychlé a silné a dobře vyzbrojené, že neměly žádného jiného nepřítele. Teď žralok zrychlil, když ucítil čerstvější pach, a jeho modrá hřbetní ploutev řezala hladinu.\n")
        .append(
            "Když ho stařec uviděl připlouvat, uvědomil si, že tenhle žralok nezná strach a udělá zrovna to, co si zamane. Připravil si harpunu a přivázal k ní lanko, zatím co pozoroval, jak se žralok blíží. Lanko bylo krátké, protože scházel kus, který uřízl, aby připoutal svou rybu.\n")
        .append(
            "Teď měl stařec hlavu jasnou a v pořádku a překypoval rozhodností, ale měl málo naděje. Bylo to příliš krásné na to, aby to vytrvalo, pomyslel si. Pohlédl letmo na velkou rybu a pozoroval dál blížícího se žraloka. Vyjde to na stejno, jako by se mi všechno jen zdálo, uvědomil si v duchu. Nemůžu mu zabránit, aby se na mě nevrhl, ale snad bych ho mohl dostat. Dentuso, proklel ho v duchu. Čert aby vzal tvou mámu!\n")
        .append(
            "Žralok je rychle dohnal odzadu, a když se vrhl na rybu, viděl stařec jeho otevřenou tlamu a podivné oči a slyšel cvaknutí jeho zubů, když se zahryzl do rybího masa těsně nad ocasem. Žraloci hlava vyčnívala z vody a jeho hřbet se vynořoval a stařec slyšel, jak se na jeho velké rybě trhá kůže a maso.Vtom okamžiku vrazil stařec harpunu žralokovi do hlavy v těch místech, kde spojnice mezi očima protínala čáru, táhnoucí se mu od nosu přímo vzad. Ty čáry nebylo ve skutečnosti vidět. Bylo vidět jen těžkou špičatou modrou hlavu a veliké oči a cvakající, dravě chňapající hltavé čelisti. Ale v těch místech má žralok mozek a stařec ho tam zasáhl. Zasáhl ho svýma krví pomazanýma rukama a vbodl mu tam dobře mířenou harpunu ze všech sil. Vrazil mu ji tam bez naděje, ale odhodlaně a s naprostou škodolibou nenávistí.\n")
        .append(
            "Žralok se převalil a stařec viděl, že mu v oku vyhasl život. A pak se převalil ještě jednou a zamotal se do dvou kliček provazu. Stařec věděl, že je mrtev, ale žralok to nechtěl uznat. Převrácený na záda mrskal ocasem a cvakal čelistmi a rozrýval hladinu jako rychlý motorový člun. Voda zbělela údery jeho ocasu a tělo mu ze tří čtvrtin vyčnívalo nad vodu, když se provaz ztuha napjal, zadrnčel a pak praskl. Žralok zůstal chvilku klidně ležet na hladině a stařec ho pozoroval. Pak se velmi pomalu potopil.\n")
        .append(
            "\"Urval aspoň dvacet kilo,\" řekl si stařec nahlas. A připravil mě o harpunu, pomyslel si, a o celé lanko, a moje ryba zase krvácí a to přiláká další.\n")
        .append(
            "Od chvíle, co byla ryba zmrzačena, se na ni nepodíval. Když byla zasažena ona, bylo mu, jako by byl zasažen on sám.\n")
        .append(
            "Ale zabil jsem žraloka, který mou rybu zmrzačil, utěšoval se. A byl to ten největší dentuso, jakého jsem kdy viděl. A bůh ví, že jsem viděl pořádné kusy!\n")
        .append(
            "Bylo to příliš krásné na to, aby to vytrvalo, opakoval si v duchu. Kéž by to tak byl sen, kéž bych byl tu rybu nikdy neulovil a kéž bych ležel sám doma v posteli na novinách!\n")
        .append(
            "\"Ale člověk není stvořen pro porážku,\" promluvil nahlas: \"Člověka je možno zničit, ale ne porazit.\" Jenže mi je přece jen líto, že jsem svou rybu zabil, pokračoval v myšlenkách. Teď přijdou horké chvíle a já nemám ani tu harpunu. Dentuso je krutý a schopný a silný a chytrý. Ale já jsem byl chytřejší než on. A možná že ani ne. Možná že jsem byl jen lip ozbrojen.\n")
        .append(
            "\"Nemudruj, staříku! \"napomenul se nahlas. \"Pluj dál tímhle směrem a vyrovnej se s tím, až to přijde!\"\n")
        .append(
            "Ale já přece musím myslet, namítal si v duchu. Vždy je to všechno, co mi zbývá. To a baseball. Rád bych věděl, jak by se slavnému DiMaggiovi líbila ta rána, kterou jsem ho zasáhl do mozku? Nic tak slavného na tom nebylo, vymlouval si to. To by dokázal každý. Ale nemyslíš, že ty moje ruce jsou právě takový handicap jako kostní ostruha? To nemůžu vědět. Nikdy jsem s patou nic neměl, leda tenkrát, když jsem při koupání šlápl na hrotnatého rejnoka a když mi to ochromilo celé lýtko a nesnesitelně to bolelo.\n")
        .append(
            "\"Mysli radši na něco veselého, staříku!\" řekl si nahlas. \"Každou minutu jsi teď blíž k domovu. Pluje se ti lehčeji o těch dvacet kilo.\"\n")
        .append(
            "Měl docela dobrou představu o tom, co se může dít, až dorazí do vnitřního pásma proudu. Ale už se nedá nic dělat.\n")
        .append(
            "\"A dá,\" ozval se nahlas. \"Můžu si přivázat nůž k násadě vesla.\"\n")
        .append(
            "Tak to tedy udělal, přidržuje si rukověť kormidla v podpaží a přišlapávaje skot plachty nohou.\n")
        .append(
            "\"A je to,\" prohlásil pak. \"Jsem starý dědek, pravda. Ale nejsem bezbranný.\"\n")
        .append(
            "Brisa teď čerstvě pofukovala a člun plul bystře vpřed. Stařec se díval jenom na přední část ryby a začal zase trochu doufat.\n")
        .append(
            "Bylo by hloupé nedoufat, říkal si v duchu. Ostatně si myslím, že je to hřích. Neuvažuj o hříchu! napomenul se. Mám toho teď na krku dost i bez hříchu. A taky se v tom nevyznám.\n")
        .append(
            "Nevyznám se v tom a nevím tak docela jistě, jestli tomu věřím. Možná, že byl hřích zabít tu rybu. Nejspíš byl, i když jsem to udělal, abych se udržel na živu a opatřil potravu pro spoustu lidí. Ale pak by bylo všechno hřích. Neuvažuj o hříchu! Na to je už moc pozdě a jsou lidi, co jsou za to placeni. Ať o tom uvažují oni! Ty ses narodil rybářem, zrovna tak jako se ryba narodila rybou. Svatý Petr byl taky rybářem zrovna tak jako otec slavného DiMaggia.\n")
        .append(
            "Ale přemýšlel rád o všem, co se ho týkalo, a protože neměl nic ke čtení ani rádio, přemýšlel hodně a teď uvažoval dál o hříchu. Nezabil jsi tu rybu jenom proto, aby ses udržel naživu a abys ji prodal jako potravu, říkal si v duchu. Zabil jsi ji z pýchy a protože jsi rybář. Miloval jsi ji, když byla na živu, a miloval jsi ji i pak. Když jsi ji miloval, nebyl to hřích zabít ji. Nebo byl to snad hřích tím větší?\n")
        .append("\"Moc mudruješ, staříku,\" řekl si nahlas.\n")
        .append(
            "Ale toho dentuso jsi zabil s rozkoší, pomyslel si. Žije z živých ryb zrovna jako ty. Není to mrchožrout ani prostě jen plovoucí apetit jako někteří jiní žraloci. Je krásný a vznešený a nebojí se ničeho na světě.\n")
        .append(
            "\"Zabil jsem ho v sebeobraně,\" promluvil stařec nahlas. \"A zabil jsem ho jaksepatří.\"\n")
        .append(
            "Ostatně, pokračoval v myšlenkách, všechno se navzájem zabíjí, tak nebo tak. Rybaření mě zabíjí zrovna tak, jako mě udržuje při životě. Při životě mě drží chlapec, namítl si. Nesmím si toho tolik namlouvat.\n")
        .append(
            "Nahnul se přes pažení a utrhl kus rybího masa z místa, kde marlina napadl žralok. Žvýkal je a uvědomoval si jeho jakost a dobrou chuť. Bylo pevné a šťavnaté, jako zvířecí maso, ale nebylo červené. Nebylo nijak vláknité a stařec věděl, že by za ně na trhu dostal nejvyšší cenu. Ale nebylo možno zabránit, aby se jeho pach nešířil ve vodě, a stařec věděl, že mu nadcházejí velmi horké chvíle.\n")
        .append(
            "Brisa dula vytrvale. Přicházela teď o kousek dál ze severovýchodu a on z toho poznal, že neopadne. Hleděl před sebe, ale nespatřil jedinou plachtu nebo trup či kouř jediné lodi. Viděl jenom létavé ryby, které se mu vznášely před přídí a plachtily pryč po obou stranách člunu, a žluté pásy chaluh. Jinak nezahlédl dokonce ani ptáka.\n")
        .append(
            "Plul tak dvě hodiny, leže na zádi a žvýkaje občas kus masa z marlina, snaže se odpočívat a nabrat sil, když uzřel prvního z obou žraloků.\n")
        .append(
            "\"Ay!\" vykřikl nahlas. To slovo se nedá přeložit a je to možná jen bezděčný výkřik, jaký může člověk vyrazit, když cítí, jak mu rukama proniká hřeb zarážený do dřeva.\n")
        .append(
            "\" Galanos, \" zjistil nahlas. Zahlédl teď za první ploutví vystupovat druhou a poznal v nich podle hnědé trojúhelníkovité ploutve a mrskajícího se ocasu tuponosé žraloky. Zachytili pach, byli vzrušeni a ve své tupé hladové nenažranosti při tom vzrušení pach stále ztráceli a znovu nalézali. Ale ustavičně se přibližovali.\n")
        .append(
            "Stařec uvázal škot plachty a zaklesl pevně rukojeť kormidla. Pak uchopil veslo s přivázaným nožem. Zvedl je co možná lehce, protože se mu přitom ruce bouřily bolestí. Střídavě je zlehka otvíral a svíral, aby si je uvolnil. Pak je pevně semkl kolem vesla, aby si zvykly na bolest a neucukly, a pozoroval blížící se žraloky. Viděl teď jejich zploštělé lopatovité hlavy a široké prsní ploutve s bílými konečky. Byli to zuřiví, ošklivě páchnoucí žraloci, mrchožrouti i zabijáci, a když měli hlad, byli s to zahryznout se do vesla nebo do kormidla člunu. To oni ukusovali nohy a ploutve mořským želvám, které usnuly na hladině, a když měli hlad, napadali ve vodě člověka, i když nebyl cítit rybí krví nebo rybím slizem.\n")
        .append(
            "\"Ay, \" opakoval stařec. \" Galanos. Tak pojďte, galanos!\"\n")
        .append(
            "Žraloci přišli. Ale ne tak, jako zaútočil mako. Jeden z nich se obrátil a zmizel z dohledu pod loďkou a stařec cítil, jak se loďka otřásá, když škubal a rval marlina. Druhý pozoroval starce štěrbinami žlutých očí a pak rychle vyrazil, půlkruhovité čelisti dokořán, aby se zahryzl do ryby v místech, kde už byla rozervána. Na vršku jeho hnědé hlavy se dozadu jasně rýsovala čára, označující, kde přechází mozek v míchu, a stařec do toho bodu vrazil nůž připevněný k veslu, vytrhl jej a vrazil jej žralokovi znovu do žlutých kočičích očí. Žralok se pustil ryby a sklouzl do hloubky, polykaje ve smrtelném tažení urvané sousto.\n")
        .append(
            "Loďka se stále ještě otřásala ničivými nárazy, kterými druhý žralok rval rybu, a stařec pustil škot plachty tak, aby se člun stočil bokem a odkryl žraloka ve vodě. Když ho uviděl, naklonil se přes pažení a bodl po něm. Zasáhl jenom kus urvaného masa a žraloci kůže byla tak tvrdá, že do ní nůž sotva pronikl. Ta rána ho zabolela nejen v rukou, nýbrž i v rameni. Ale žralok se rychle vynořil hlavou napřed a stařec ho zasáhl přímo do jejího ploského vršku, sotva vystrčil nos z vody a zahryzl se do ryby. Stařec vytáhl čepel a bodl žraloka ještě jednou přesně do téhož místa. Žralok stále ještě visel zahryznut čelistmi na rybě a stařec mu vrazil nůž do levého oka. Žralok se pořád nepouštěl.\n")
        .append(
            "\"Ne?\" vykřikl stařec a pohroužil mu čepel mezi obratel a mozek. Teď se lehce strefil a cítil, jak chrupavka povolila. Obrátil veslo a vrazil lopatku žralokovi mezi čelisti, aby mu je rozevřel. Zapáčil, a když se žralok pustil a sklouzl dolů, řekl mu : \"Tak běž, galano! Propadni se míli hluboko! Běž za svým kamarádem, nebo je to možná tvoje máma!\"\n")
        .append(
            "Stařec si utřel čepel nože a položil veslo. Pak našel skot plachty, plachta se napjala a on vyrovnal loďku do správného kursu.\n")
        .append(
            "\"Museli z ní urvat aspoň čtvrtinu, a zrovna toho nejlepšího masa,\" povzdechl si hlasitě. \"Kdyby to tak byl všechno sen a kdybych ji byl nikdy nechytil! Je mi to líto, rybo. Všechno se tím pokazilo.\" Odmlčel se a nechtěl se na rybu ani podívat. Teď, když vykrvácela, měla pod přelévajícími se vlnami barvu stříbrného amalgamu na rubu zrcadla a její pruhy byly ještě stále patrný.\n")
        .append(
            "\"Neměl jsem se pouštět tak daleko, rybo,\" oslovil ji. \"Nebylo to dobré pro tebe ani pro mne. Je mi to líto, rybo.\"\n")
        .append(
            "Tak, řekl si v duchu. Podívej se na provaz kolem nože, jestli se nepotrhal. A dej si do pořádku ruku, protože nás toho čeká ještě víc.\n")
        .append(
            "\"Kdybych tak měl na ten nůž brousek!\" pronesl stařec nahlas, když si prohlédl vázání na konci vesla. \"Měl jsem vzít brousek s sebou.\" Měl jsi s sebou vzít víc věcí, pomyslel si. Ale nevzals, staříku. Teď není čas uvažovat o tom, co nemáš. Mysli na to, co dokážeš s tím, co máš po ruce.\n")
        .append(
            "\"Moc mi toho pořád radíš,\" osopil se nahlas sám na sebe. \"Mám toho už po krk.\"\n")
        .append(
            "Přidržel si rukojeť kormidla v podpaží a máčel si obě ruce ve vodě, zatím co loďka plula vpřed.\n")
        .append(
            "\"Pánbůví kolik toho urval ten poslední,\" řekl si. \"Ale jsme teď o hodně lehčí.\" Nechtěl ani myslet na rozervanou spodní část ryby. Věděl, že po každé, když žralok s trhnutím vyrazil, znamenalo to kus vyrvaného masa a že teď ryba zanechává pro všechny ostatní žraloky v moři stopu širokou jako silnice.\n")
        .append(
            "Byla to ryba, ze které by člověk mohl žít celou zimu, říkal si. Nemysli na to! Prostě odpočívej a snaž si dát ruce do pořádku, abys mohl bránit, co z ní zbylo. Čpění krve na mých rukou teď nic neznamená ve srovnání se vším tím pachem ve vodě. Ostatně nekrvácejí tolik. Nic důležitého pořezáno nemám. Krvácení může pomoci levičce od křečí.\n")
        .append(
            "O čem teď mohu přemýšlet? O ničem. Nesmím přemýšlet o ničem a musím čekat, až se objeví další. Kéž by to byl opravdu jen sen! Ale kdo ví? Možná že to ještě dopadne dobře.\n")
        .append(
            "Další žralok, který se objevil, byl osamocený tuponosec. Přihnal se jako vepř ke korytu, kdyby měl vepř hubu tak širokou, že by do ní mohl člověk strčit hlavu. Stařec ho nechal zaútočit na rybu a pak mu vrazil nůž na vesle dolů do mozku. Ale jak se žralok převaloval, škubl sebou zpět a čepel nože praskla.\n")
        .append(
            "Stařec se usadil ke kormidlování. Ani se nedíval, jak velký žralok pomalu ve vodě klesá, jak je ho vidět nejprve v životní velikosti, pak malého a nakonec maličkého. To starého vždycky fascinovalo. Ale teď se ani nepodíval.\n")
        .append(
            "\"Mám ještě bodec s hákem,\" zjišťoval nahlas. \"Ale ten k ničemu nebude. A mám dvě vesla a rukojeť od kormidla a krátký kyj.\"\n")
        .append(
            "Tak mě dostali, pomyslel si. Jsem moc starý na to, abych utloukl žraloka k smrti. Ale pokusím se o to, dokud mám vesla a kyj a rukojeť kormidla.\n")
        .append(
            "Strčil ruce znovu do vody, aby si je vymáchal. Odpoledne se sklánělo ke konci a on neviděl nic než moře a oblohu. Bylo větrněji než předtím a stařec doufal, že už brzo zahlédne zemi.\n")
        .append(
            "\"Jsi unavený, staříku,\" řekl si. \"Ta únava ti sedí v těle.\"\n")
        .append(
            "Žraloci na něho znovu zaútočili teprve těsně před západem slunce.\n")
        .append(
            "Stařec spatřil hnědé ploutve blížící se v širokém sledu, který jistě ryba ve vodě zanechávala. Nevětřili dokonce ani sem a tam po stopě. Namířili si to rovnou k loďce a pluli jeden vedle druhého.\n")
        .append(
            "Zaklesl rukojeť kormidla, uvázal škot a sáhl pod zadní paloubku pro kyj. Byla to násada zlomeného vesla seříznutá do délky necelých tří čtvrtin metru. Mohl jí účinně použít jenom jednou rukou - kvůli tvaru rukojeti - a uchopil kyj pevně pravačkou, svíraje kolem něho prsty, a pozoroval, jak se žraloci blíží. Byli to dvagalanos.\n")
        .append(
            "Musím nechat toho prvního pořádně zakousnout a praštit ho přes špičku čumáku nebo přímo přes vršek hlavy, umiňoval si v duchu.\n")
        .append(
            "Oba žraloci se přiblížili společně, a když stařec viděl toho bližšího rozvírat čelisti a hroužit je do stříbrného boku ryby, zvedl vysoko kyj a udeřil pádně a prudce do vršku široké žraloci hlavy. Ucítil, jak kyj dopadl na gumovitě houževnatý podklad. Ale ucítil také nepovol-nost kosti a uhodil žraloka tvrdě ještě jednou přes čumák v tom okamžiku, kdy sklouzával s ryby.\n")
        .append(
            "Druhý žralok se střídavě přibližoval a vzdaloval a teď se znovu blížil s čelistmi dokořán. Stařec viděl, jak se mu v koutku tlamy bělají kusy masa ryby, do které se zabořil a stiskl čelisti. Rozpřáhl se po něm, zasáhl jen hlavu a žralok se na něho podíval a vytrhl maso rybě z těla. Stařec se po něm rozehnal kyjem ještě jednou, když sebou žralok smýkl stranou, aby sousto polkl, ale zasáhl jenom kutnou houževnatou gumovitou hmotu.\n")
        .append(
            "\"Jen pojď, galano!\" vyzýval žraloka. \"Pojď ještě jednou!\"\n")
        .append(
            "Žralok se prudce přihnal a stařec ho zasáhl, zrovna když scvakával čelisti. Udeřil jej důrazně a tak zvysoka, jak jen mohl zvednout kyj. Tentokrát ucítil lebeční kost na spodní části mozku a zasáhl jej ještě jednou do téhož místa, když žralok tupě odtrhával maso a klouzal s ryby dolů.\n")
        .append(
            "Stařec vyhlížel, jestli se nevynoří znovu, ale ani jeden ze žraloků se neukázal. Pak spatřil, jak jeden z nich plove v kruzích při hladině. Ploutev druhého neviděl.\n")
        .append(
            "Nedalo se čekat, že je zabiju, pomyslel si. Byly časy, kdy bych je byl možná zabil. Ale pošramotil jsem je oba pořádně a žádný z nich se asi necítí zvlášť dobře. Kdybych je byl mohl napálit oběma rukama, byl bych toho prvního určitě zabil. I dnes.\n")
        .append(
            "Nechtěl se podívat na rybu. Věděl, že polovička je z ní zničena. Slunce zapadlo, zatím co bojoval se žraloky.\n")
        .append(
            "\"Za chvilku se setmí,\" uvědomil si nahlas. \"To bych pak měl uvidět světla Havany. A jestli jsem se dostal moc daleko na východ, uvidím světla na některé z těch nových pláží.\"\n")
        .append(
            "Teď už nemůžu být tak daleko od břehu, pokračoval v myšlenkách. Doufám, že si se mnou nikdo nedělal moc velké starosti. Starosti si ovšem může dělat jenom chlapec. Ale ten na mě určitě spoléhá. Hodně starších rybářů bude mít starosti. A mnoho ostatních taky, pomyslil si. Žiju mezi dobrými lidmi.\n")
        .append(
            "Nemohl už mluvit k rybě, protože ryba byla tak zle poničena. Pak se mu něco kmitlo hlavou. \"Polorybo,\" řekl nahlas. \"Rybo, která jsi byla. Lituju, že jsem se vypravil tak daleko. Zničilo nás to oba. Ale zabili jsme mnoho žraloků, ty i já, a mnoho jiných jsme zle potrefili. Kolik jsi jich vůbec zabila ty, stará vojno? Nemáš to kopí na hlavě jen tak zbůhdarma.\"\n")
        .append(
            "Líbilo se mu myslet na mečouního marlina a na to, co by byl udělal žralokovi, kdyby volně plul. Měl jsem si useknout jeho meč a bojovat jím, napadlo ho. Jenže tu nemám žádnou sekyrku a nemám ani nůž.\n")
        .append(
            "Ale kdybych ho měl čím useknout a mohl ho přivázat k násadě vesla, to by byla zbraň! Mohli bychom pak s nimi bojovat společně. A co si počneš teď, když přijdou v noci? Co můžeš dělat?\n")
        .append(
            "\"Bojovat s nimi,\" odpověděl si nahlas. \"Budu s nimi bojovat, dokud nepadnu.\"\n")
        .append(
            "Ale teď ve tmě a bez nejmenšího jasu a beze světel, jenom s větrem a pod vytrvale napjatou plachtou mu připadalo, že už je možná vlastně mrtev. Sepjal ruce a ucítil své dlaně. Ty nebyly mrtvé a dokázal v nich vzbudit bolest života prostě tím, že je otvíral a zavíral. Opřel se hřbetem o záď a věděl, že není mrtev. Řekla mu to vlastní ramena.\n")
        .append(
            "Mám se pomodlit všechny ty modlitby, které jsem slíbil, jestli tu rybu chytím, napadlo ho. Ale teď jsem moc unavený na to, abych je odříkával. Spíš bych si měl vzít pytel a dát si ho přes ramena.\n")
        .append(
            "Ležel na zádi, kormidloval a vyhlížel, až se na obloze ukáže záře. Mám jí ještě polovičku, uvažoval. Snad budu mít to štěstí, že dorazím ke břehu s přední půlkou celou. Zasloužil bych si kapku štěstí. Ba ne, namítl si. Pokazil sis to štěstí, když ses pustil tak daleko.\n")
        .append(
            "\"Nebuď blázen!\" okřikl se nahlas. \"Dej pozor, ať neusneš, a kormidluj! Možná, že tě pořádné štěstí ještě čeká.\"\n")
        .append(
            "\"Rád bych si ho trochu koupil, kdyby je někde prodávali,\" řekl si nahlas.\n")
        .append(
            "Zač bych si jje koupil? zeptal se sám sebe. Dá se koupit za ztracenou harpunu, za zlomeny nůž a za dvě zmrzačené ruce?\n")
        .append(
            "\"Možná,\" odpověděl si nahlas. \"Pokoušel ses je koupit za čtyřiaosmdesát dní na moři. A skoro jsi je za ně dostal.\"\n")
        .append(
            "Nesmím mudrovat o nesmyslech, řekl si v duchu. Štěstí přichází v mnoha podobách, a kdo je dokáže poznat? Ale stejně bych ho trochu chtěl, ať má jakou chce podobu, a zaplatil bych, co by chtěli. Přál bych si už vidět záři světel, pomyslel si. Přeju si toho vůbec příliš mnoho. Ale tohle bych si přál teď. Pokusil se usadit u kormidla pohodlněji a podle bolesti, kterou mu to působilo, cítil, že není mrtev.\n")
        .append(
            "Uviděl odraženou záři městských světel někdy kolem desáté hodiny v noci. Byla zprvu patrná jen jako přísvit na obloze, než vyjde měsíc. Pak je bylo vidět ustavičně přes oceán, který se nyní v zesilující břiše prudce dmul. Stařec zamířil za tou září a myslel si, že teď už jistě brzy narazí na okraj proudu.\n")
        .append(
            "Už je po všem, řekl si v duchu. Nejspíš mě ještě jednou napadnou. Ale co proti nim člověk zmůže ve tmě a beze zbraně?\n")
        .append(
            "Byl teď všecek ztuhlý a rozbolavělý a cítil v nočním chladu všechny rány a všechna namožená místa v celém těle. Doufám, že už nebudu muset bojovat, opakoval si úpěnlivě. Tolik doufám, že už nebudu muset bojovat.\n")
        .append(
            "Ale k půlnoci bojoval a věděl tentokrát, že bojuje nadarmo. Přišli v celé smečce a on viděl jenom čáry ve vodě, které rýsovaly jejich hřbetní ploutve, a jejich fosforeskování, když se vrhali na rybu. Bušil je po hlavách a slyšel zahryzávající se čelisti a cítil, jak lomcují loďkou, když se pustili do ryby zespodu. Bušil zoufale do něčeho, co jenom cítil a slyšel, a pak něco chňaplo po kyji a kyj byl ten tam.\n")
        .append(
            "Vytrhl z kormidla jeho rukojeť a bil a bušil jí, svíral ji oběma rukama a tloukl znovu a znovu do vln. Ale žraloci se teď táhli k přídi a útočili jeden za druhým a všichni dohromady a rvali kusy masa, které světélkovalo pod vodou, když se obraceli k dalšímu výpadu.\n")
        .append(
            "Jeden se konečně vrhl na samu rybí hlavu a stařec věděl, že je po všem. Švihl rukojetí kormidla přes žraloci tlamu, zahryznutou čelistmi do masivní hlavy marlina, která nechtěla povolit. Udeřil jednou a po druhé a ještě jednou. Slyšel, jak rukojeť praskla, a vrhl se na žraloka zlomeným koncem. Cítil, jak vniká dovnitř, a protože věděl, že má ostrou špici, vrazil ji do něho ještě jednou. Žralok se pustil, překotil se a zmizel. Byl to poslední žralok z celé smečky. Už tu neměli co žrát.\n")
        .append(
            "Stařec sotva dýchal a cítil v ústech zvláštní chuť. Jakoby měděnou a nasládlou a na okamžik sejí polekal. Ale nebylo to tak zlé.\n")
        .append(
            "Plivl do oceánu a řekl: \"Sežerte si to, galanos! A nechtě si zdát, že jste zabili člověka!\"\n")
        .append(
            "Teď věděl, že byl dočista poražen a že se nedá už vůbec nic dělat. Vykročil na záď a shledal, že se roztřepený konec rukojeti dá docela dobře strčit do svorek kormidla, takže bude moci řídit. Zabalil si ramena do pytle a vrátil člun do kursu. Plulo se mu teď lehce a byl prost jakýchkoli myšlenek i pocitů. Všechno už bylo za ním, a řídil tedy člun, aby se dostal do svého domovského přístavu tak hladce a rozvážně, jak to jen půjde. V noci napadli žraloci ohlodaný trup, jako kdyby někdo sbíral drobečky se stolu. Stařec si jich ani nevšiml a nevšímal si vůbec ničeho než kormidlování. Uvědomoval si jen, jak lehce a bystře teď loďka pluje, když nemá po boku žádnou velkou zátěž.\n")
        .append(
            "Loďka je v pořádku, pomyslel si. Je celá a není nijak poškozená, až na tu kormidelní páku. Ta se dá snadno nahradit.\n")
        .append(
            "Ucítil, že se teď dostal do proudu, a uviděl světla pobřežních osad podél celého břehu. Teď věděl, kde je, a dostat se domů byla už hračka.\n")
        .append(
            "Vítr je stejně náš přítel, napadlo ho. A pak dodal - někdy. A nesmírné moře se všemi našimi přáteli i nepřáteli. A postel, kmitlo mu hlavou. Postel je taky můj přítel. Prostě postel, pomyslel si. Postel, to bude báječné! Jak je to lehké, když je člověk poražen, řekl si v duchu. Nikdy jsem nevěděl, jakje to lehké. A co tě porazilo? zeptal se sám sebe.\n")
        .append(
            "\"Nic,\" odpověděl si nahlas. \"Pustil jsem se moc daleko.\"\n")
        .append(
            "Když vplouval do malé přístavní zátoky, světla na Terase nesvítila a stařec věděl, že jsou všichni v posteli.\n")
        .append(
            "Brisa neustále sílela a dula teď prudce. Přesto však bylo v zátoce klidno a stařec najel na úzký pruh oblázků pod skalisky. Nebyl tu, kdo by mu pomohl, a tak vytáhl loďku tak daleko, jak jen dokázal. Pak vystoupil a přivázal ji k jednomu balvanu.\n")
        .append(
            "Vytáhl stěžeň a skasal plachtu a přivázal ji ke stěžni. Pak si hodil stěžeň přes rameno a začal šplhat nahoru. A právě v tom okamžiku si uvědomil, jak velice je unaven. Zůstal na chvilku stát, ohlédl se a uviděl v odrazu pouliční lampy ohromný rybí ocas, tyčící se hezky daleko za zádí člunu. Viděl nahou bílou linii rybí páteře a temný masiv hlavy s vyčnívajícím mečem a všechnu tu nahotu mezi tím.\n")
        .append(
            "Dal se znovu do šplhání a nahoře padl a zůstal chvíli ležet se stěžněm přes rameno. Pokusil se vstát. Ale bylo to příliš obtížné a tak tam seděl se stěžněm na rameni a hleděl na silnici. Na druhé straně přešla kočka za svými spády a stařec ji pozoroval. Pak pozoroval prostě silnici.\n")
        .append(
            "Konečně položil stěžeň na zem a vstal. Zvedl stěžeň, dal si jej na rameno a vykročil po silnici. Pětkrát si ještě musel sednout, než došel ke své chatrči.\n")
        .append(
            "V chatrči opřel stěžeň o stěnu. Nahmatal potmě láhev s vodou a napil se. Pak si lehl na lůžko. Přetáhl si pokrývku přes ramena a potom přes záda a přes nohy a usnul s tváří dolů na novinách a s rukama nataženýma dlaněmi vzhůru.\n")
        .append(
            "Když chlapec ráno nahlédl do dveří, zastihl jej ve spánku. Vítr dul tak silně, že čluny, zvyklé dát se i se sítěmi nést vlnami, dnes nevypluly a chlapec dlouho spal a pak přišel k starcově chatrči, jako přicházel každé ráno. Viděl, že stařec oddychuje, a pak spatřil jeho ruce a rozplakal se. Vyšel velice tiše ven, aby přinesl trochu kávy, a celou cestu po silnici plakal.\n")
        .append(
            "Mnoho rybářů stálo kolem loďky a dívalo se, co je to k ní přivázáno, a jeden stál ve vodě s vyhrnutými nohavicemi a měřil kostru provazovou mírou.\n")
        .append(
            "Chlapec dolů nesestoupil. Byl tam už předtím a jeden z rybářů za něho hlídal člun.\n")
        .append("\"Jak mu je?\" zakřičel jeden rybář.\n")
        .append(
            "\"Spí,\" zavolal chlapec. Nestaral se o to, že ho všichni vidí plakat. \"Ať ho nikdo neruší!\"\n")
        .append(
            "\"Měřila od nosu k ocasu pět a půl metru,\" křikl na něho rybář s měřicí šňůrou.\n")
        .append("\"To věřím,\" odpověděl chlapec.\n")
        .append("Sel do Terasy a požádal o plechovku kávy.\n")
        .append("\"Horkou, a hodně mléka a cukru.\"\n")
        .append("\"Ještě něco?\"\n")
        .append("\"Ne. Uvidím pak, co může jíst.\"\n")
        .append(
            "\"Taková ryba!\" řekl hospodský. \"Taková ještě na světě nebyla. Ale ty dvě, cos chytil včera, byly taky pěkné ryby.\"\n")
        .append(
            "\"Čert vzal moje ryby,\" utrhl se chlapec a znovu se rozplakal.\n")
        .append("\"Nechceš něco k pití? Vyber si!\" nabídl mu hostinský.\n")
        .append(
            "\"Ne,\" zavrtěl chlapec hlavou. \"Řekněte jim, ať Santiaga neobtěžují. Ještě se vrátím.\"\n")
        .append("\"Vyřiď mu, že mě to strašně mrzí.\"\n")
        .append("\"Děkuju,\" rozloučil se chlapec.\n")
        .append(
            "Donesl plechovku horké kávy do starcovy chatrče a seděl vedle něho, dokud se starý neprobudil. Jednou to vypadalo, jako že se probírá. Ale upadl opět do těžkého spánku a chlapec šel na druhou stranu přes silnici vypůjčit si nějaké dříví na ohřátí kávy.\n")
        .append("Konečně se starý vzbudil.\n")
        .append(
            "\"Nesedejte si,\" řekl mu chlapec. \"Vypijte tohle!\" Nalil trochu kávy do sklenice.\n")
        .append("Stařec ji vzal a vypil.\n")
        .append(
            "\"Dostali mě, Manoline,\" řekl chlapci. \"Opravdu mě porazili.\"\n")
        .append("\" Ona vás neporazila. Ta ryba ne!\"\n")
        .append("\"Ne. Máš pravdu. To bylo až potom.\"\n")
        .append(
            "\"Pedrico hlídá člun a výstroj. Co chcete udělat s tou hlavou?\"\n")
        .append("\"Ať ji Pedrico rozseká do rybích pastí.\"\n")
        .append("\"A její meč?\"\n").append("\"Nech si ho, jestli chceš.\"\n")
        .append(
            "\"Chci,\" přisvědčil chlapec. \"A teď si musíme rozmyslet, co podnikneme s ostatními věcmi.\"\n")
        .append("\"Pátrali po mně?\"\n")
        .append("\"Samozřejmě. Pobřežní hlídky a letadla.\"\n")
        .append(
            "\"Oceán je ohromný a loďka malá. Dá se těžko uvidět,\" řekl stařec. Uvědomil si, jak je příjemné mít s kým rozmlouvat, místo aby hovořil pořád sám k sobě nebo k moři. \"Chyběl jsi mi,\" dodal pak. \"Co jste chytili?\"\n")
        .append("\"První den jednu. Druhý den taky jednu a třetí den dvě.\"\n")
        .append("\"Výborně.\"\n").append("\"Teď budeme lovit zase spolu.\"\n")
        .append("\"Ne. Nemám štěstí. Už nemám žádné štěstí.\"\n")
        .append(
            "\"Čert vzal štěstí,\" odpověděl chlapec. \"Se mnou mít štěstí budete.\"\n")
        .append("\"Co tomu řeknou tvoji rodiče?\"\n")
        .append(
            "\"Na tom nezáleží. Včera jsem chytil dvě. Ale budeme jezdit na ryby spolu, protože se toho musím ještě spoustu naučit.\"\n")
        .append(
            "\"Musíme si opatřit dobrý oštěp a mít ho vždycky na palubě. Můžeš udělat čepel z péra od nějaké staré fordky. Můžeme si ho dát nabrousit v Guanabacoa. Čepel musí být ostrá a ne kalená, aby se nezlomila. Nůž se mi zlomil.\"\n")
        .append(
            "\"Seženu jiný nůž a to péro dám nabrousit. Kolik dní budeme mít tuhle prudkou brisu?\"\n")
        .append("\"Snad tři. Snad víc.\"\n")
        .append(
            "\"Dám všechno do pořádku,\" ujistil ho chlapec. \"Vy si vy kurýrujte ruce, dědo!\"\n")
        .append(
            "\"O ty se už postarám. V noci jsem vyplivl něco divného a měl jsem pocit, že se mi něco utrhlo v prsou.\"\n")
        .append(
            "\"Z toho se taky vykurýrujte,\" nabádal ho chlapec. \"Lehněte si, dědo, a já vám přinesu vaši čistou košili. A něco k jídlu.\"\n")
        .append(
            "\"Přines nějaké noviny z té doby, co jsem byl pryč,\" požádal stařec.\n")
        .append(
            "\"Musíte se uzdravit rychle, protože se toho můžu spoustu naučit, a vy mě naučíte všechno. Hodně jste zkusil?\"\n")
        .append("\"Ažaž,\" odpověděl starý.\n")
        .append(
            "\"Přinesu něco k jídlu a ty noviny,\" řekl hoch. \"Dobře si odpočiňte, dědo! Přinesu vám z drogerie mazání na ruce.\"\n")
        .append("\"Nezapomeň říct Pedricovi, aby si vzal tu hlavu!\"\n")
        .append("\"Ne, budu na to pamatovat.\"\n")
        .append(
            "Když vyšel chlapec ze dveří a šlapal po vyježděné silnici z korálového vápence, znovu plakal.\n")
        .append(
            "Toho odpoledne byla na Terase společnost turistů, a když se dívali dolů do vody, uviděla nějaká žena mezi prázdnými plechovkami od piva a mrtvými štikovitými soltíny ohromný dlouhý hřbet z bílých obratlů, zakončený obrovskou ocasní ploutví, která se zdvíhala a pohupovala v příboji, zatím co na širém moři za vjezdem do přístavní zátoky vzdouval východní vítr silné a vytrvalé vlnobití.\n")
        .append(
            "\"Co je to tamhle?\" zeptala se číšníka a ukázala na dlouhou páteř veliké ryby, která teď byla už jen odpadkem a čekala, až ji odplaví odliv.\n")
        .append(
            "\"Tiburon,\" odpověděl ji číšník. \"Žralok.\" Chtěl tak vysvětlit, co se stalo.\n")
        .append(
            "\"Nevěděla jsem, že žraloci mají tak pěkné, tak krásně vykrojené ocasní ploutve.\"\n")
        .append("\"Já taky ne,\" přidal se její společník.\n").append(
            "O kus dál po silnici stařec ve své chatrči zase spal. Spal opět tváří dolů a chlapec seděl vedle a díval se na něho. Starému se zdálo o lvech.\n");
*/
    return sb.toString();
  }

}
