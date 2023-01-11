class FeatureSet() {

boolean[] bArr = {false};

  public boolean[] getFeatures(String theWord){
    // check 1
    bArr[0] = ...
    // check 2
    ...
    // check 3 ...
    ...

    return bArr;
  }

}


class Token() {
  String theWord = "";
  boolean[] arr = {false};
  setFuckingFeatures();

  
  setFuckingFeatures(){
      arr = feature.getFeatures(this.theWord); // will return a bool array
  }

}

FeatureSet[] feature;

class Block(){
private ArrayList<Token> tokens;
  
this.rawBlock = block.split("\b");     /** splitting raw block by everything */
        this.tokens = new ArrayList<>(rawBlock.length);
  
  
  for(String rb : this.rawBlock){
            this.tokens.add(new Token(rb));
        }
 
  /** 
  * after tokens created we will have a list of tokens with only the word, our bool array will be empty
  * this is why we are putting it in the for loop 
  * so now we are going through each token and setting the features
  */
  
  for(Token t: this.tokens){
  /** t contains our word... */
      t.setFuckingFeatures();
  }
  
}



/** final info */
everything that was on the midterm
java doc, documenting your code
you can go through the questions from midterm on blackboard
look at report/anal tools
javadoc style tools and how they are used
integration and system tests - be able to explain how they are 
different from unit tests and when they are used. you dont need to be able to write them
final is 28th to 29th - 3hr window





