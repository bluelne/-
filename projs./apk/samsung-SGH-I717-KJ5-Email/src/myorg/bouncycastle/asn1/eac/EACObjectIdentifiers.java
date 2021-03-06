package myorg.bouncycastle.asn1.eac;

import myorg.bouncycastle.asn1.DERObjectIdentifier;

public interface EACObjectIdentifiers {

   DERObjectIdentifier bsi_de = new DERObjectIdentifier("0.4.0.127.0.7");
   DERObjectIdentifier id_CA;
   DERObjectIdentifier id_CA_DH;
   DERObjectIdentifier id_CA_DH_3DES_CBC_CBC;
   DERObjectIdentifier id_CA_ECDH;
   DERObjectIdentifier id_CA_ECDH_3DES_CBC_CBC;
   DERObjectIdentifier id_EAC_ePassport;
   DERObjectIdentifier id_PK;
   DERObjectIdentifier id_PK_DH;
   DERObjectIdentifier id_PK_ECDH;
   DERObjectIdentifier id_TA;
   DERObjectIdentifier id_TA_ECDSA;
   DERObjectIdentifier id_TA_ECDSA_SHA_1;
   DERObjectIdentifier id_TA_ECDSA_SHA_224;
   DERObjectIdentifier id_TA_ECDSA_SHA_256;
   DERObjectIdentifier id_TA_ECDSA_SHA_384;
   DERObjectIdentifier id_TA_ECDSA_SHA_512;
   DERObjectIdentifier id_TA_RSA;
   DERObjectIdentifier id_TA_RSA_PSS_SHA_1;
   DERObjectIdentifier id_TA_RSA_PSS_SHA_256;
   DERObjectIdentifier id_TA_RSA_v1_5_SHA_1;
   DERObjectIdentifier id_TA_RSA_v1_5_SHA_256;


   static {
      StringBuilder var0 = new StringBuilder();
      DERObjectIdentifier var1 = bsi_de;
      String var2 = var0.append(var1).append(".2.2.1").toString();
      id_PK = new DERObjectIdentifier(var2);
      StringBuilder var3 = new StringBuilder();
      DERObjectIdentifier var4 = id_PK;
      String var5 = var3.append(var4).append(".1").toString();
      id_PK_DH = new DERObjectIdentifier(var5);
      StringBuilder var6 = new StringBuilder();
      DERObjectIdentifier var7 = id_PK;
      String var8 = var6.append(var7).append(".2").toString();
      id_PK_ECDH = new DERObjectIdentifier(var8);
      StringBuilder var9 = new StringBuilder();
      DERObjectIdentifier var10 = bsi_de;
      String var11 = var9.append(var10).append(".2.2.3").toString();
      id_CA = new DERObjectIdentifier(var11);
      StringBuilder var12 = new StringBuilder();
      DERObjectIdentifier var13 = id_CA;
      String var14 = var12.append(var13).append(".1").toString();
      id_CA_DH = new DERObjectIdentifier(var14);
      StringBuilder var15 = new StringBuilder();
      DERObjectIdentifier var16 = id_CA_DH;
      String var17 = var15.append(var16).append(".1").toString();
      id_CA_DH_3DES_CBC_CBC = new DERObjectIdentifier(var17);
      StringBuilder var18 = new StringBuilder();
      DERObjectIdentifier var19 = id_CA;
      String var20 = var18.append(var19).append(".2").toString();
      id_CA_ECDH = new DERObjectIdentifier(var20);
      StringBuilder var21 = new StringBuilder();
      DERObjectIdentifier var22 = id_CA_ECDH;
      String var23 = var21.append(var22).append(".1").toString();
      id_CA_ECDH_3DES_CBC_CBC = new DERObjectIdentifier(var23);
      StringBuilder var24 = new StringBuilder();
      DERObjectIdentifier var25 = bsi_de;
      String var26 = var24.append(var25).append(".2.2.2").toString();
      id_TA = new DERObjectIdentifier(var26);
      StringBuilder var27 = new StringBuilder();
      DERObjectIdentifier var28 = id_TA;
      String var29 = var27.append(var28).append(".1").toString();
      id_TA_RSA = new DERObjectIdentifier(var29);
      StringBuilder var30 = new StringBuilder();
      DERObjectIdentifier var31 = id_TA_RSA;
      String var32 = var30.append(var31).append(".1").toString();
      id_TA_RSA_v1_5_SHA_1 = new DERObjectIdentifier(var32);
      StringBuilder var33 = new StringBuilder();
      DERObjectIdentifier var34 = id_TA_RSA;
      String var35 = var33.append(var34).append(".2").toString();
      id_TA_RSA_v1_5_SHA_256 = new DERObjectIdentifier(var35);
      StringBuilder var36 = new StringBuilder();
      DERObjectIdentifier var37 = id_TA_RSA;
      String var38 = var36.append(var37).append(".3").toString();
      id_TA_RSA_PSS_SHA_1 = new DERObjectIdentifier(var38);
      StringBuilder var39 = new StringBuilder();
      DERObjectIdentifier var40 = id_TA_RSA;
      String var41 = var39.append(var40).append(".4").toString();
      id_TA_RSA_PSS_SHA_256 = new DERObjectIdentifier(var41);
      StringBuilder var42 = new StringBuilder();
      DERObjectIdentifier var43 = id_TA;
      String var44 = var42.append(var43).append(".2").toString();
      id_TA_ECDSA = new DERObjectIdentifier(var44);
      StringBuilder var45 = new StringBuilder();
      DERObjectIdentifier var46 = id_TA_ECDSA;
      String var47 = var45.append(var46).append(".1").toString();
      id_TA_ECDSA_SHA_1 = new DERObjectIdentifier(var47);
      StringBuilder var48 = new StringBuilder();
      DERObjectIdentifier var49 = id_TA_ECDSA;
      String var50 = var48.append(var49).append(".2").toString();
      id_TA_ECDSA_SHA_224 = new DERObjectIdentifier(var50);
      StringBuilder var51 = new StringBuilder();
      DERObjectIdentifier var52 = id_TA_ECDSA;
      String var53 = var51.append(var52).append(".3").toString();
      id_TA_ECDSA_SHA_256 = new DERObjectIdentifier(var53);
      StringBuilder var54 = new StringBuilder();
      DERObjectIdentifier var55 = id_TA_ECDSA;
      String var56 = var54.append(var55).append(".4").toString();
      id_TA_ECDSA_SHA_384 = new DERObjectIdentifier(var56);
      StringBuilder var57 = new StringBuilder();
      DERObjectIdentifier var58 = id_TA_ECDSA;
      String var59 = var57.append(var58).append(".5").toString();
      id_TA_ECDSA_SHA_512 = new DERObjectIdentifier(var59);
      StringBuilder var60 = new StringBuilder();
      DERObjectIdentifier var61 = bsi_de;
      String var62 = var60.append(var61).append(".3.1.2.1").toString();
      id_EAC_ePassport = new DERObjectIdentifier(var62);
   }
}
