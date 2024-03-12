/* RobotTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashMap;

/** Token Manager. */
@SuppressWarnings ("unused")
public class RobotTokenManager implements RobotConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 3;
         return jjMoveNfa_0(2, 0);
      case 10:
         jjmatchedKind = 4;
         return jjMoveNfa_0(2, 0);
      case 13:
         jjmatchedKind = 2;
         return jjMoveNfa_0(2, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(2, 0);
      case 40:
         jjmatchedKind = 37;
         return jjMoveNfa_0(2, 0);
      case 41:
         jjmatchedKind = 38;
         return jjMoveNfa_0(2, 0);
      case 44:
         jjmatchedKind = 46;
         return jjMoveNfa_0(2, 0);
      case 58:
         jjmatchedKind = 36;
         return jjMoveNfa_0(2, 0);
      case 63:
         jjmatchedKind = 39;
         return jjMoveNfa_0(2, 0);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10080400000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20300000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1800L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40084000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x410000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x28020L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x801040000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1c0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x20110000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2000400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 0);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10348404000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x24201800L);
      case 70:
      case 102:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 1;
         }
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x100080L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 79:
      case 111:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x803028120L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x880000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x52040L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 1);
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x40404080L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x201800L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000400L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000040000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x300010000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80880000L);
      case 80:
      case 112:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x1002000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000000L);
      case 84:
      case 116:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
         }
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x28020L);
      case 90:
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 2);
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa4_0(active0, 0x300010000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 69:
      case 101:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x420028000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 75:
      case 107:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 3;
         }
         break;
      case 76:
      case 108:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 78:
      case 110:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 80:
      case 112:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 84:
      case 116:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x3000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x801000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 3);
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa5_0(active0, 0x28000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000800L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 72:
      case 104:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
         }
         break;
      case 75:
      case 107:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 78:
      case 110:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x40800000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 83:
      case 115:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
         }
         break;
      case 84:
      case 116:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 4;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(2, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 4);
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 71:
      case 103:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 5;
         }
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 79:
      case 111:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x10200000000L);
      case 82:
      case 114:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 5;
         }
         break;
      case 84:
      case 116:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
         }
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 5);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 68:
      case 100:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
         }
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 84:
      case 116:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 6;
         }
         break;
      case 86:
      case 118:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 6);
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000L);
      case 69:
      case 101:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 7;
         }
         break;
      case 82:
      case 114:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 7;
         }
         break;
      case 83:
      case 115:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 7;
         }
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(2, 7);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 7);
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 8;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(2, 8);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 43;
                  { jjCheckNAdd(1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  kind = 42;
                  { jjCheckNAdd(0); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\72", "\50", "\51", "\77", 
null, null, null, null, null, null, "\54", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public RobotTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public RobotTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 2; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x4fffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[2];
    private final int[] jjstateSet = new int[2 * 2];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
