/* Copyright 2004 University of Helsinki, Department of Computer
   Science. See license.txt for details. */
    
package fi.hu.cs.titokone.resources;

import java.util.ListResourceBundle;

/** This translation is what all translations should be based on. It 
    translates keys to plain English. Note that not all keys are equal 
    to their values; the key may contain a specification part which
    should not be translated. The specification part ought to be 
    put between ? and :, eg. "?Menu:File" would mean "translate the 
    word 'File' as if you would see it on the common menu name" as 
    opposed to "?Utility item:File", which might mean "translate the 
    word 'File' as you would if it meant a nail file". */
public class Translations_fi extends ListResourceBundle {
   public Object[][] getContents() { 
     return contents;
   }
     
   protected static final Object[][] contents = {
      // Localize below, pairs of key-value (what key is in your language)...
      // Remove lines which you do not wish to translate completely. Leaving
      // in a value of "" will translate the message to "" as well.

      // Class: Animator, not processed yet - TODO.

      // Class: Application.
      // General messages: (none)
      // Exception messages:
      { "No more keyboard data stored on application." , 
        "Sovellukseen ei ole talletettu enemp�� n�pp�imist�dataa." },
      { "No more stdin data stored on application.", 
	"Sovellukseen ei ole talletettu enemp�� stdin-dataa." },
      {	"Keyboard input string \"{0}\" invalid, should be eg. \\n-separated " +
	"list of integers." , 
	"N�pp�imist�sy�te \"{0}\" ei kelpaa; sen tulisi olla esimerkiksi " +
	"\\n-merkein eroteltu kokonaislukulista."},
      { "Stdin input string \"{0}\" invalid, should be eg. \\n-separated " +
	"list of integers.", 
	"Stdin-sy�te \"{0}\" ei kelpaa; sen tulisi olla esimerkiksi " +
	"\\n-merkein eroteltu kokonaislukulista."},
      // Log messages:
      { "Application has no more keyboard data, read: {0}, buffer length " +
	"{1}.", 
	"Sovelluksessa ei ole en�� n�pp�imist�dataa; luettu {0}, puskurin " +
	"pituus {1}."},
      { "Application has no more stdin data, read: {0}, buffer length {1}.", 
	"Sovelluksessa ei ole en�� stdin-dataa; luettu {0}, puskurin " +
	"pituus {1}." },
      { "Accepted \"{0}\" as keyboard input, tokens found: {1}.", 
	"\"{0}\" hyv�ksytty n�pp�insy�tteeksi, {1} sy�terivi� eritelty." },
      { "Accepted \"{0}\" as stdin input, tokens found: {1}.", 
	"\"{0}\" hyv�ksytty stdin-sy�tteeksi, {1} sy�terivi� eritelty."}, 

      // Class: BinaryInterpreter, no messages.

      // Class: Binary
      {"___b91___ is missing.", "___b91___ puuttuu."},
      {"___code___ is missing.", "___code___ puuttuu."},
      {"Invalid code area value on line: {0}", 
       "Koodialueen alkuarvo rivill� {0} ei kelpaa."},
      {"Invalid code area length on line: {0}", 
       "Koodialueen pituus rivill� {0} ei kelpaa."},
      {"Invalid command on line: {0}", 
       "Ep�kelpo komento rivill� {0}."},
      {"Invalid number of code lines.", 
       "Koodirivien m��r� ei kelpaa."},
      {"___data___ is missing.", "___data___ puuttuu."},
      {"Invalid data area value on line: {0}", 
       "Data-alueen alkuarvo rivill� {0} ei kelpaa."},
      {"Invalid data area length on line: {0}", 
       "Data-alueen pituus rivill� {0} ei kelpaa."},
      {"Invalid data on line: {0}", 
       "Data rivill� {0} ei kelpaa."},
      {"___symboltable___ is missing.", 
       "___symboltable___ puuttuu."},
      {"Invalid symbol on line: {0}", 
       "Ep�kelpo symbolinimi rivill� {0}."},
      {"Invalid symbol value on line: {0}", 
       "Ep�kelpo symbolin arvo rivill� {0}."},
      {"___end___ is missing.", "___end___ puuttuu."},
      {"Lines after ___end___", "___end___-merkin j�lkeen on viel� rivej�."},
      
      // Class: CompileDebugger, no messages.
      // Class: CompileInfo, no messages.

      // Class: Compiler				// line (approx)
      {"Compilation is not finished yet.", 
       "K��nn�s ei ole viel� valmistunut."},	        // 203
      {"Invalid command.", "Ep�kelpo komento."},	// 255
      {"Invalid label.", "Ep�kelpo muistiviite."},     // 271, 328, 345 and 349
      {"Found label {0} and variable {1}.", 
       "L�ydettiin muistiviite {0} ja muuttuja {1}."},	// 323
      {"Variable {0} used.", "Muuttujaa {0} k�ytettiin."},// 328
      {"Label {0} found.", "L�ydettiin muistiviite {0}."}, // 333
      {"Invalid size for a DS.", "Ep�kelpo DS:n koko."},// 358 and 362
      {"Invalid value for a DC.", "Ep�kelpo DC:n arvo."},// 373
      {"Variable {0} defined as {1}.", 
       "Muuttuja {0} samaistettu arvoon {1}."},		// 401
      {"Found variable {0}.", "L�ydettiin muuttuja {0}."}, // 419 and 436
      {"{0} defined as {1}.", 
       "Asetukselle {0} m��riteltiin arvoksi {1}."},	// 449
      {"Invalid DEF operation.", "Ep�kelpo DEF-komento."}, // 454
      //ADDED 26.4. OLLi
      {"Missing referred label {0}.", "K�ytetty muistiviite {0} puuttuu."}, //662
      {"{0} --> {1} ({2}) ", "{0} --> {1} ({2})"}, // symb --> bin (:-sep. bin); 650

      // Class: Control
      {"No default STDIN file set.", "Oletus-STDIN-tiedostoa ei asetettu."},
      {"No default STDOUT file set.", "Oletus-STDOUT-tiedostoa ei asetettu."},
      {"No application to load.", "Ladattava sovellus puuttuu."},
      {"STDIN data file unreadable: {0}", 
       "STDIN-datatiedostoa ei voi lukea: {0}"}, 
      {"STDIN data file contains invalid data: {0}", 
       "STDIN-datatiedoston sis�lt� ei kelpaa: {0}"},
      {"STDIN files were null, data not inserted to the application.", 
      "STDIN-tiedostot olivat arvoltaan null, joten sovellukseen ei " +
       "liitetty tiedostodataa."},
      {"Application contained an odd definition key '{0}'.", 
      "Sovelluksessa oli m��ritelty tuntematon asetus '{0}'."},
      {"Trying to run an unsupported type of application. (The application " +
       "must be created using the same program.)", 
       "T�m� sovellus on ep�yhteensopiva eik� sit� voi ajaa. Sovellus pit�� " +
       "luoda samalla ohjelmalla kuin se ajetaan."},
      {"Cannot form a binary out of an unsupported type of an application. " +
       "(The application must be created using the same program.)", 
       "T�m� sovellus on ep�yhteensopiva eik� siit� voi muodostaa " +
       "bin��ritiedostoa. Sovellus pit�� luoda samalla ohjelmalla kuin " +
       "joka sit� tulkitsee bin��ritiedostoksi."},
      {"There is no application available to run from!", 
       "Vain ajettava sovellus puuttuu!.."},
      {"No STDOUT file set, not writing to it.", 
       "STDOUT-tiedostoa ei ole asetettu, joten siihen ei juuri kirjoiteta."},
      {"Memory size must be between 2^9 and 2^16, a change to 2^{0} failed.", 
       "Muistin koon tulee olla v�lilt� 2^9 - 2^16. Muutos arvoon 2^{0} " +
       "ep�onnistui."},
      {"StdIn file contents are invalid; the file should contain only " +
       "integers and separators.", 
       "StdIn-tiedoston sis�lt� ei kelpaa; tiedoston tulisi sis�lt�� vain " +
       "kokonaislukuja ja erotinmerkkej�."},
       {"Modified source was null.", "Muokatuksi l�hdekoodiksi tarjottiin " +
	"null-arvoa."},
      {"No source file set, use openSource first.", 
       "L�hdekooditiedostoa ei ole asetettu; kutsu openSource-metodia ensin."},
      {"Cannot deduce the file to store the binary into; no source " +
       "file has been loaded.", 
       "Bin��rin tallennustiedoston nime� ei voi p��tell� " +
       "l�hdekooditiedostosta, jota ei ole avattu. Vaikeuksien vaikeus."},
      {"Cannot save binary to file; no application has been compiled or " +
       "loaded.", "Sovellusta ei ole k��nnetty eik� avattu, joten sen " +
       "bin��ri� ei voi tallentaa tiedostoon."},

      // Class: DebugInfo, no messages.

      // Class: FileHandler
      {"{0} in loadResourceBundle(): {1}", "Poikkeus {0} " +
       "loadResourceBundle()-metodissa: {1}"},
      {"No read access to {0}.", "Lukuoikeus tiedostoon {0} uupuu."},
      {"No write access to {0}.", "Kirjoitusoikeus tiedostoon {0} uupuu."},
      
      // Class: GUI 
      {"File", "Tiedosto"},
      {"Open", "Avaa"},
      {"Compile", "K��nn�"},
      {"Run", "Aja"},
      {"Continue", "Jatka"},
      {"Continue without pauses", "Jatka tauoitta"},
      {"Stop", "Pys�yt�"},
      {"Erase memory", "Tyhjenn� muisti"},
      {"Exit", "Poistu ohjelmasta"},
      {"Options", "Asetukset"},
      {"Set memory size", "Aseta muistin koko"},
      {"Help", "Apua"},
      {"Manual", "Ohjeet"},
      {"About", "Tietoja ohjelmasta"},
      {"Set compiling options", "Muuta k��nn�sasetuksia"},
      {"Set running options", "Muuta suoritusasetuksia"},
      {"Configure file system", "Aseta tiedostoj�rjestelm��"},
      {"Select default stdin file", "Valitse oletus-stdin-tiedosto"},
      {"Select default stdout file", "Valitse oletus-stdout-tiedosto"},
      {"Set language", "Aseta kieli"},
      {"Select from a file...", "Valitse tiedostosta..."},

      {"Line", "Rivi"},   
      {"Numeric value", "Numeromuoto"},    
      {"Symbolic content", "Symbolinen muoto"},

      {"Open a new file", "Avaa uusi tiedosto"},
      {"Compile the opened file", "K��nn� avattu tiedosto"},
      {"Run the loaded program", "Suorita ladattu ohjelma"}, 
      {"Continue current operation", "Jatka nykyoperaatiota"},
      {"Continue current operation without pauses", 
       "Jatka nykyoperaatiota tauotta"},
      {"Stop current operation", "Keskeyt� nykyoperaatio"},
      {"Enable/disable animated execution", "Animoitu suoritus p��lle/pois"},
      {"Enable/disable extra comments during execution", "Suorituksen ylim��r�inen kommentointi p��lle/pois"},
      {"Enable/disable line by line execution", "Riveitt�in suoritus p��lle/pois"},
      {"about.html", "about_fi.html"},
      {"manual.html", "manual_fi.html"},
      {"__ABOUT_FILENAME__", "about_fi.html"},
      {"__MANUAL_FILENAME__", "manual_fi.html"},
      
      {"Enter", "Sy�t�"}, // button used to enter a number to the KBD device.
      {"Symbol table", "Symbolitaulu"}, 
      {"Registers", "Rekisterit"}, 
      
      // Class: GUIBrain 
      {"Main path not found! (Trying to locate etc/settings.cfg.) " +
       "...exiting.",        //exception opening etc/settings.cfg
       "Asennuspolku ei l�ytynyt! (Yritettiin paikantaa " +
       "etc/settings.cfg:t�.) ...poistun."}, 
      {"I/O error while reading settings file: {0}", 
       "I/O-virhe asetustiedostoa luettaessa: {0}"}, 
      {"Parse error in settings file.", 
       "J�sennysvirhe asetustiedostoa luettaessa."},
      {"Titokone out of memory: {0}", "Titokoneesta loppui muisti: {0}"},
      {"Opened a new k91 source file.", 
       "Avattiin uusi k91-l�hdekooditiedosto."},
      {"File extension must be k91 or b91", "Tiedostop��tteen tulee " +
       "olla k91 tai b91."}, 
      {"Illegal input", "Sy�te ei kelpaa"},   
      {"Illegal input. You must insert a number between {0}...{1}", 
      "Sy�te ei kelpaa. Sen tulee olla luku v�lilt� {0}..{1}."},
      {"Error", "Virhe"},  
      {"Enter a number in the text field above.", 
       "Sy�t� luku yll�olevaan tekstikentt��n."},
      {"Not a language file", "Kielitiedoston lataaminen ep�onnistui."},    
      {"Cannot overwrite {0}", "Tiedostoa {0} ei voi ylikirjoittaa."},   
      {"Default stdin file set to {0}", 
       "Oletus-stdin-tiedosto on nyt {0}"},    
      {"Default stdout file set to {0}", 
       "Oletus-stdout-tiedosto on nyt {0}."},    
      {"Error while emptying {0}", 
       "Virhe tyhj�tt�ess� tiedostoa {0}."},    
      {"Overwrite?", "Ylikirjoitetaanko?"},    
      {"Do you want to overwrite the file? Select {1} to append or {0} " +
       "to overwrite.", "Haluatko ylikirjoittaa tiedoston? Valitse {1} " +
       "liitt�miseksi, tai {0} tiedoston ylikirjoittamiseksi."},
      {"Waiting for KBD input...", "Odotetaan KBD-sy�tett�..."},
      {"Execution aborted due to an error", "Suoritus keskeytyi virhetilanteen vuoksi"},
      {"Compilation aborted due to an error", "K��nt�minen keskeytyi virhetilanteen vuoksi"},
      {"Current operation aborted", "Meneill��n ollut operaatio keskeytettiin"},
      {"B91 binary", "B91-bin��ri"},   
      {"K91 source", "K91-l�hdekooditiedosto"},  
      {"Class file", "Luokkatiedosto"},

      // Class: GUICompileSettingsDialog
      // (Set compiling options already defined in GUI.)
      {"Apply", "Muuta"},
      {"Close", "Sulje"},
      {"Compile line by line", "K��nn� rivitt�in"},
      {"Show comments", "N�yt� kommentit"},
      {"Set compiling options", "Muokkaa k��nn�sasetuksia"},
      // Pause whenever a comment occurs & show extra comments while compiling
      // represented in JOptionPane.

      // Class: GUIRunSettingsDialog
      // (Set running options already defined in GUI, as are Apply and Close.)
      {"Execute line by line", "Suorita rivitt�in"},
      {"Show comments", "N�yt� kommentit"},
      {"Show animation", "N�yt� animointi"},
      // (execute code line by line, show extra comments while executing
      // and show animation while executing are represented in JOptionPane.

      // Class: GUIThreader, no messages.
      // Class: Interpreter, no messages.
      // Class: InvalidDefinitionException, no messages.
      // Class: InvalidSymbolException, no messages.

      // Class: JFileChooser    
      // Open already represented in GUI.     
      {"Cancel", "Peruuta"},    
      {"Look in:", "Ty�hakemisto:"},    
      {"File name:", "Tiedoston nimi:"},    
      {"Files of type:", "N�yt� tiedostot tyyppi�:"},    
      {"Up one level", "Yl�hakemistoon"},    
      {"Up", "Yl�s"},    
      {"Desktop", "Ty�p�yt�"},    
      {"Create new folder", "Luo uusi hakemisto"},    
      {"New folder", "Uusi hakemisto"},    
      {"List", "Lista"},    
      {"Details", "Yksityiskohtaiset tiedot"},    
      {"All files", "Kaikki tiedostot"},    
      {"Abort file selection", "Peruuta tiedoston valinta"},  
      {"Open the selected file", "Avaa valittu tiedosto"},
      
      // Class: JOptionPane    
      {"Yes", "Kyll�"},    
      {"No", "Ei"},
      {"Pause whenever a comment occurs" , 
       "Pys�yt� k��nt�minen kommentin ilmentyess�."},
      {"Show extra comments while compiling", 
       "N�yt� lis�kommentteja k��nt�misen kulusta."},
      {"Execute code line by line", 
       "Suorita koodia rivi kerrallaan."},
      {"Show extra comments while executing", 
       "N�yt� lis�kommentteja suorituksen kulusta"},
      {"Show animation while executing", "N�yt� animointi suorittaessa"},
      {"Apply" , "Aseta"},  
      {"Close" , "Sulje"}, 
      
      // Class: JTableX, no messages.

      // Class: Loader
      {"Null is an invalid parameter, instance of {0} required.", 
       "Null ei kelpaa parametriksi, vaaditaan luokan {0} ilmentym�."},
      {"Program loaded into memory. FP set to {0} and SP to {1}.", 
       "Ohjelma ladattu muistiin. FP asetettu {0}:ksi ja SP {1}:ksi."},
      
      // Class: LoadInfo, no messages.
      // Class: MemoryLine, no messages.
      // Class: Message, no messages. (Surprising, huh?)
      
      // Class: Processor
      {"Invalid operation code {0}", "Ep�kelpo operaatiokoodi {0}"},
      {"Memory address out of bounds", 
       "Muistiosoite osoittaa muistin ulkopuolelle"},
      {"Invalid memory addressing mode", "Ep�kelpo muistinosoitusmoodi"},
      {"Invalid memory access mode in branching command", 
       "Ep�kelpo muistinosoitusmoodi haarautumisk�skyss�"},
      {"Invalid memory access mode in STORE", 
       "Ep�kelpo muistinosoitusmoodi STORE-k�skylle"},
      {"No keyboard data available", "N�pp�imist�dataa ei ole saatavilla"},
      {"No standard input data available", 
       "STDIN-levydataa ei ole saatavilla"},
      {"Invalid device number", "Ep�kelpo laitenumero"},
      {"Integer overflow", "Kokonaisluvun ylivuoto"},
      {"Division by zero", "Nollalla jako"},
      {"Row number {0} is beyond memory limits.", 
       "Rivinumero {0} ylitt�� muistialueen rajat."}, // in memoryInput
      
      // Class: RandomAccessMemory
      {"Memory size cannot be negative.", 
       "Muistin koko ei voi olla negatiivinen."},
      {"Tried to set symbol table to null.", 
       "Symbolitaulua yritettiin asettaa null-arvoksi."}, 
      {"Trying to load a null memory line.", 
       "Yritettiin ladata null-muistirivi." },
      {"Address {0} too large, memory size {1} (indexing starts at 0).",
       "Osoite {0} on liian suuri, muistin koko on {1} (indeksointi " +
       "alkaa nollasta)."},
      {"Address {0} below zero.", "Osoite {0} on alle nollan."},
      {"Code area size cannot be negative.", 
       "Koodialueen koko ei voi olla negatiivinen."},
      {"Code area size cannot be bigger than the size of the whole memory.", 
       "Koodialueen koko ei voi ylitt�� muistin kokoa."},
      {"Data area size cannot be negative.", 
       "Data-alueen koko ei voi olla negatiivinen."},
      {"Data area size cannot be bigger than the size of the whole memory.",
       "Data-alueen koko ei voi ylitt�� muistin kokoa."},
      
      // Class: Registers
      {"Unknown registerId: {0}", "Tuntematon rekisteritunnus: {0}"},
      {"Unknown registerName: {0}", "Tuntematon rekisterin nimi: {0}"},
      
      // Class: ResourceLoadFailedException, no messages.
      // Class: RunDebugger, comments
      {"{0}{1} Indexing {2}, direct.", "{0}{1} indeksointi {2}, v�lit�n"},
      {"{0}{1} Indexing {2}, direct addressing.", 
       "{0}{1} indeksointi {2}, suora muistiosoitus."},
      {"{0}{1} Indexing {2}, indirect addressing.", 
       "{0}{1} indeksointi {2}, ep�suora muistiosoitus."},
      
      // Comment with value (=KBD, =CRT =STDIN =STDOUT)
      {"{0}{1} Indexing {2}, direct, value {3}.", 
       "{0}{1} indeksointi {2}, v�lit�n, arvo {3}."},
      // Are these two needed?
      {"{0}{1} Indexing {2}, direct addressing, value {3}.", 
       "{0}{1} indeksointi {2}, suora muistiosoitus, arvo {3}."},
      {"{0}{1} Indexing {2}, indirect addressing {3}.", 
       "{0}{1} indeksointi {2}, ep�suora muistiosoitus {3}."},
      
      // Class: RunInfo, no messages.
      
      // Class: Settings.
      // General messages: (none)
      // Exception messages: 
      { "value", "arvo" },
      { "a linebreak", "rivinvaihdon" },
      { "Illegal {0} \"{1}\", contains {2}.", "Ep�kelpo {0} \"{1}\", " +
	"sis�lt�� {2}." },
      { "Illegal {0}: null. Try an empty string instead.", 
	"Ep�kelpo {0}: null. Kokeile mieluummin tyhj�� merkkijonoa."},
      { "Syntax error on line {0}, which was: \"{1}\".", 
	"Syntaksivirhe rivill� {0}, sis�lt� \"{1}\"."},
      // Log messages: 
      { "Settings successfully parsed, lines: {0}, unique keys found: {1}.", 
	"{0} rivi� asetuksia j�sennetty onnistuneesti, yksil�llisi� " +
	"tunnisteita l�ytyi {1}."},

      // Class: Source, no messages.
      // Class: SymbolicInterpreter, no messages.
      
      // Class: SymbolTable
      {"SymbolName was null.", "SymbolName oli arvoltaan null."},
      {"Definition key was null.", "Asetuksen tunniste oli null."},
      {"Definition {0} not found.", "Asetusta {0} ei l�ytynyt."}

      // Class: Translator: no translateable strings set to avoid 
      // looping bugs.
      

      // Localizable bit ends. 
  };
}
