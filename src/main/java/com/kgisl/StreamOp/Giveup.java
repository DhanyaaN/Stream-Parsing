package com.kgisl.StreamOp;

public class Giveup {
    private String TRADENUM;
    private String BS_IND;
    private String BROK_ID;
    private String PART_CODE;
    private String INST_TYPE;
    private String SYMBOL;
    private String EXP_DATE;
    private String STR_PRICE;
    private String OPT_TYPE;
    private String TRD_QTY;
    private String TRD_PRICE;
    private String GV_STS;
    private String OC_FLAG;
    private String CU_FLAG;
    private int ORDER_NUM;
    private String LAST_MODIDT;
    private String RESERVED;

public void setBROK_ID(String bROK_ID) {
    this.BROK_ID = bROK_ID;
}
public void setBS_IND(String bS_IND) {
    this.BS_IND = bS_IND;
}
public void setCU_FLAG(String cU_FLAG) {
    this.CU_FLAG = cU_FLAG;
}
public void setEXP_DATE(String eXP_DATE) {
    this.EXP_DATE = eXP_DATE;
}
public void setGV_STS(String gV_STS) {
    this.GV_STS = gV_STS;
}
public void setINST_TYPE(String iNST_TYPE) {
    this.INST_TYPE = iNST_TYPE;
}
public void setLAST_MODIDT(String lAST_MODIDT) {
    this.LAST_MODIDT = lAST_MODIDT;
}
public void setOC_FLAG(String oC_FLAG) {
    this.OC_FLAG = oC_FLAG;
}
public void setOPT_TYPE(String oPT_TYPE) {
    this.OPT_TYPE = oPT_TYPE;
}
public void setORDER_NUM(int oRDER_NUM) {
    this.ORDER_NUM = oRDER_NUM;
}
public void setPART_CODE(String pART_CODE) {
    this.PART_CODE = pART_CODE;
}
public void setRESERVED(String rESERVED) {
    this.RESERVED = rESERVED;
}
public void setSTR_PRICE(String sTR_PRICE) {
    this.STR_PRICE = sTR_PRICE;
}
public void setSYMBOL(String sYMBOL) {
    this.SYMBOL = sYMBOL;
}
public void setTRADENUM(String tRADENUM) {
    this.TRADENUM = tRADENUM;
}
public void setTRD_PRICE(String tRD_PRICE) {
    this.TRD_PRICE = tRD_PRICE;
}
public void setTRD_QTY(String tRD_QTY) {
    this.TRD_QTY = tRD_QTY;
}
public String getBROK_ID() {
    return BROK_ID;
}
public String getBS_IND() {
    return BS_IND;
}
public String getCU_FLAG() {
    return CU_FLAG;
}
public String getEXP_DATE() {
    return EXP_DATE;
}
public String getGV_STS() {
    return GV_STS;
}
public String getINST_TYPE() {
    return INST_TYPE;
}
public String getLAST_MODIDT() {
    return LAST_MODIDT;
}
public String getOC_FLAG() {
    return OC_FLAG;
}
public String getOPT_TYPE() {
    return OPT_TYPE;
}
public int getORDER_NUM() {
    return ORDER_NUM;
}
public String getPART_CODE() {
    return PART_CODE;
}
public String getRESERVED() {
    return RESERVED;
}
public String getSTR_PRICE() {
    return STR_PRICE;
}
public String getSYMBOL() {
    return SYMBOL;
}
public String getTRADENUM() {
    return TRADENUM;
}
public String getTRD_PRICE() {
    return TRD_PRICE;
}
public String getTRD_QTY() {
    return TRD_QTY;
}
@Override
public String toString() {
  return "{ Treadenum="+TRADENUM+
      "BS Ind="+BS_IND+
      "BROK_ID= "+BROK_ID+
      "PART_CODE="+PART_CODE+
      "INST_TYPE="+INST_TYPE+
      "SYMBOL="+SYMBOL+
      "EXP_DATE="+EXP_DATE+
      "STR_PRICE="+STR_PRICE+
      "OPT_TYPE=" +OPT_TYPE+
      "TRD_QTY="+TRD_QTY+
      "TRD_PRICE="+TRD_PRICE+
      "GV_STS="+GV_STS+
      "OC_FLAG="+OC_FLAG+
      "CU_FLAG="+CU_FLAG+
      "CU_FLAG="+ORDER_NUM+
      "LAST_MODIDT="+LAST_MODIDT+
      "RESERVED="+RESERVED+"}";
  }
  @Override
  public boolean equals(Object obj) {
      if(obj instanceof Giveup){
        return ((Giveup) obj).ORDER_NUM==ORDER_NUM;
      }
      return false;
  }
  @Override
  public int  hashCode() {
      return this.ORDER_NUM;
  }

}








