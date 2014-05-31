Usage
=====

### Note :
This module is still under development and this document presently shows only currently available utilities.

#### Creating object
```
Syllabifier obj = new Syllabifier();
```
The code demonstrates on how to create a Syllabifier object. 

#### Get Syllabified text
```
Syllabifier obj = new Syllabifier();
String text = "A syllable is a unit of organization for a sequence of speech sounds.";
String syllabifiedText = obj.syllabify(text);

// Sample output:  "A syl-lable is a u/nit of or-ga/ni/za/tion for a se/qu_en-ce of speech sounds."
```

The above function accepts texts and converts it as per flags given.

#### Get module name and information
```
String moduleName = obj.getModuleName();
String moduleInforamtion =  obj.getModuleInformation();
```

#### To run tests

  Tests present at `/src/test/java/`

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test
