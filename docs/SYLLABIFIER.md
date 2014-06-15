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

#### SyllabifierEditText

```

        <org.silpa.syllabifier.SyllabifierEditText
                android:id="@+id/edtSyllabifier"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                syllabifier:syllabifierOutputTo="@+id/tvSyllabifierOutput" />

```

Here `syllabifier:syllabifierOutputTo="@+id/fieldId"` would output syllabified output of the edit text automatically to another Edittext or TextView specified by 'fieldId'

Syllabified text can also be obtained by :

```
    String syllabifiedText = edtSyllabifier.getSyllabifiedText();
```

#### SyllabifierTextView

```

        <org.silpa.syllabifier.SyllabifierTextView
                android:id="@+id/tvSyllabifier"
                android:layout_width="match_parent"
                android:layout_height="wrap_content" />

```

Here Syllabified text of text in TextView can be obtained by :

```
        SyllabifierTextView tvSyllabifier = (SyllabifierTextView) view.findViewById(R.id.tvSyllabifier);
        String syllabifiedText = tvSyllabifier.getSyllabifiedText();

```

#### To run tests

  Tests present at `/src/test/java/`

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test
