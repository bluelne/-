package myorg.bouncycastle.sasn1;

import java.io.IOException;
import java.io.InputStream;
import myorg.bouncycastle.sasn1.Asn1InputStream;
import myorg.bouncycastle.sasn1.Asn1Object;
import myorg.bouncycastle.sasn1.Asn1Set;

public class BerSet extends Asn1Object implements Asn1Set {

   private Asn1InputStream _aIn;


   protected BerSet(int var1, InputStream var2) {
      super(var1, 17, var2);
      Asn1InputStream var3 = new Asn1InputStream(var2);
      this._aIn = var3;
   }

   public Asn1Object readObject() throws IOException {
      return this._aIn.readObject();
   }
}
