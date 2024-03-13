/* Robot.java */
/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;

import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;

import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashMap;

@SuppressWarnings("serial")
public class Robot implements RobotConstants {


        private RobotWorldDec world;
        static HashMap<String,String> Variables = new HashMap< >();
        static int x;
        static boolean conde;

        void setWorld(RobotWorld w) {
                world = (RobotWorldDec) w;
        }

        String salida=new String();

//boolean command(uniandes.lym.robot.view.Console sistema) :
  final public         boolean command(Console sistema) throws ParseException {int x,y;
                salida=new String();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IF:
    case LB:{
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IF:{
          laCondicion();
salida = "Command: IF";
          break;
          }
        case LB:{
          todo();
try {
                                 Thread.sleep(900);
                    } catch (InterruptedException e) {
                                        System.err.format("IOException: %s%n", e);
                            }

                        sistema.printOutput(salida);
                        {if ("" != null) return true;}
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IF:
        case LB:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
      }
      break;
      }
    case 0:{
      jj_consume_token(0);
{if ("" != null) return false;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  final public void todo() throws ParseException {int x,y;
    jj_consume_token(LB);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MOV:
    case SKP:{
      basicos(salida);
      break;
      }
    case DEFVAR:{
      declaroVariables();
salida = "Command: Defvar";
      break;
      }
    case TURN:
    case FACE:{
      direction(salida);
      break;
      }
    case MOVEDIR:
    case MOVEFACE:{
      movDir(salida);
      break;
      }
    case RUNDIRS:{
      rundir(salida);
      break;
      }
    case GO:{
      jj_consume_token(GO);
      jj_consume_token(LB);
      x = num();
      jj_consume_token(47);
      y = num();
      jj_consume_token(RB);
world.setPostion(x,y);salida = "Command:GO ";
      break;
      }
    case PUT:{
      jj_consume_token(PUT);
      jj_consume_token(DP);
      put();
      break;
      }
    case PICK:{
      jj_consume_token(PICK);
      jj_consume_token(DP);
      get();
      break;
      }
    case POP:{
      jj_consume_token(POP);
      jj_consume_token(LB);
      x = num();
      jj_consume_token(RB);
world.popBalloons(x); salida = "Comando:  Pop";
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(RB);
}

  final public void put() throws ParseException {int f=1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CHIPS:{
      jj_consume_token(CHIPS);
      f = num();
world.putChips(f); salida = "Command:  Put Chips";
      break;
      }
    case BALLOONS:{
      jj_consume_token(BALLOONS);
      f = num();
world.putBalloons(f); salida = "Command:  Put Balloons";
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void get() throws ParseException {int f=1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CHIPS:{
      jj_consume_token(CHIPS);
      jj_consume_token(47);
      f = num();
world.pickChips(f);salida = "Command:  Pick chips";
      break;
      }
    case BALLOONS:{
      jj_consume_token(BALLOONS);
      jj_consume_token(47);
      f = num();
world.grabBalloons(f);salida="Command:  Pick balloons";
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

/**
	 * Unsigned decimal number
	 * @return the corresponding value of the string
	 * @error  corresponding value is too large
	 */
  final public 
        int num() throws ParseException, Error {int total=1;
    jj_consume_token(CONSTANT);
try
                        {
                                total = Integer.parseInt(token.image);
                        }
                        catch (NumberFormatException ee)
                        {
                                {if (true) throw new Error("Number out of bounds: "+token.image+" !!");}
                        }
                        {if ("" != null) return total;}
    throw new Error("Missing return statement in function");
}

  final public void basicos(String salida) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MOV:{
      jj_consume_token(MOV);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONSTANT:{
        x = num();
        break;
        }
      case CHAR:{
        x = getValor();
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
world.moveForward(x,false);salida = "Command: Moveforward ";
      break;
      }
    case SKP:{
      jj_consume_token(SKP);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONSTANT:{
        x = num();
        break;
        }
      case CHAR:{
        x = getValor();
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
world.moveForward(x,true);salida = "Command:Jumpforward ";
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void direction(String salida) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FACE:{
      jj_consume_token(FACE);
      jj_consume_token(DP);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT:{
        jj_consume_token(LEFT);
world.turnRight();world.turnRight();world.turnRight();salida = "Command: TurnLeft";
        break;
        }
      case RIGHT:{
        jj_consume_token(RIGHT);
world.turnRight();salida = "Command: Turnright";
        break;
        }
      case AROUND:{
        jj_consume_token(AROUND);
world.turnRight();world.turnRight();salida = "Command: TurnAround";
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case TURN:{
      jj_consume_token(TURN);
      apuntarDic();
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void apuntar() throws ParseException {
    jj_consume_token(DP);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FRONT:{
      jj_consume_token(FRONT);
salida = "Command:Front";
      break;
      }
    case LEFT:{
      jj_consume_token(LEFT);
world.turnRight();world.turnRight();world.turnRight();salida = "Command: Left";
      break;
      }
    case RIGHT:{
      jj_consume_token(RIGHT);
world.turnRight();salida = "Command: right";
      break;
      }
    case BACK:{
      jj_consume_token(BACK);
world.turnRight();world.turnRight();salida = "Command: back";
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void apuntarDic() throws ParseException {
    jj_consume_token(DP);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NORTH:{
      jj_consume_token(NORTH);
      ajustarDic(0);
      break;
      }
    case SOUTH:{
      jj_consume_token(SOUTH);
      ajustarDic(1);
      break;
      }
    case EAST:{
      jj_consume_token(EAST);
      ajustarDic(2);
      break;
      }
    case WEST:{
      jj_consume_token(WEST);
      ajustarDic(3);
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ajustarDic(int y) throws ParseException {
int apunt = world.getFacing();
        // norte 
        if (apunt == 0) {
          if(y == 1) {
            world.turnRight();
            world.turnRight();
          }
          else if(y == 2) {
            world.turnRight();

          }
          else if(y == 3) {
            world.turnRight();
            world.turnRight();
            world.turnRight();
          }
        }
        // sur
        else if (apunt == 1) {
          if(y == 0) {
            world.turnRight();
            world.turnRight();
          }
          else if(y == 3) {
            world.turnRight();

          }
          else if(y == 1) {
            world.turnRight();
            world.turnRight();
            world.turnRight();
          }
        }
        // este 
        else if (apunt == 2) {
          if(y == 3) {
            world.turnRight();
            world.turnRight();
          }
          else if(y == 1) {
            world.turnRight();

          }
          else if(y == 0) {
            world.turnRight();
            world.turnRight();
            world.turnRight();
          }
        }
        // oeste 
        else if (apunt == 3) {
          if(y == 2) {
            world.turnRight();
            world.turnRight();
          }
          else if(y == 0) {
            world.turnRight();

          }
          else if(y == 1) {
            world.turnRight();
            world.turnRight();
            world.turnRight();
          }
        }
}

  final public void movDir(String salida) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MOVEDIR:{
      jj_consume_token(MOVEDIR);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONSTANT:{
        x = num();
        break;
        }
      case CHAR:{
        x = getValor();
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      apuntar();
world.moveForward(x,false);salida = "Command: MOVE-DIR ";
      break;
      }
    case MOVEFACE:{
      jj_consume_token(MOVEFACE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONSTANT:{
        x = num();
        break;
        }
      case CHAR:{
        x = getValor();
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      apuntarDic();
world.moveForward(x,false);salida = "Command: MOVE-FACE";
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void rundir(String salida) throws ParseException {
    jj_consume_token(RUNDIRS);
    label_2:
    while (true) {
      apuntar();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DP:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_2;
      }
    }
}

  final public void declaroVariables() throws ParseException {
    jj_consume_token(DEFVAR);
    jj_consume_token(CHAR);
String key = token.image;
    jj_consume_token(CONSTANT);
String value = token.image;
Variables.put(key, value);
}

  final public int getValor() throws ParseException {
    jj_consume_token(CHAR);
String valor = token.image;
    if (!Variables.containsKey(valor)) {
    {if (true) throw new ParseException("\nUndefined variable");}
  }
    else {
      String numero = Variables.get(valor);
    {if ("" != null) return Integer.parseInt(numero);} }
    throw new Error("Missing return statement in function");
}

  final public boolean condiciones() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FACING:{
      jj_consume_token(FACING);
      jj_consume_token(Q);
{if ("" != null) return dondeve();}
      break;
      }
    case BLOCKED:{
      jj_consume_token(BLOCKED);
      jj_consume_token(Q);
{if ("" != null) return bloqueado();}
      break;
      }
    case CANPUT:{
      jj_consume_token(CANPUT);
      jj_consume_token(Q);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CHIPS:{
        jj_consume_token(CHIPS);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CHAR:{
          x = getValor();
          break;
          }
        case CONSTANT:{
          x = num();
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
if (world.getMyChips()<  x) { conde= false; } else { conde= true; }
        break;
        }
      case BALLOONS:{
        jj_consume_token(BALLOONS);
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CHAR:{
        x = getValor();
        break;
        }
      case CONSTANT:{
        x = num();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
if (world.getMyBalloons()<  x) { conde= false; } else { conde= true; }
      break;
      }
    case CANPICK:{
      jj_consume_token(CANPICK);
      jj_consume_token(Q);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CHIPS:{
        jj_consume_token(CHIPS);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CHAR:{
          x = getValor();
          break;
          }
        case CONSTANT:{
          x = num();
          break;
          }
        default:
          jj_la1[20] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
conde= recogerChips(x);
        break;
        }
      case BALLOONS:{
        jj_consume_token(BALLOONS);
        break;
        }
      default:
        jj_la1[21] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CHAR:{
        x = getValor();
        break;
        }
      case CONSTANT:{
        x = num();
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
conde= recogerBallons(x);
      break;
      }
    case CANMOVE:{
      jj_consume_token(CANMOVE);
      jj_consume_token(Q);
      apuntarDic();

      break;
      }
    case ZERO:{
      jj_consume_token(ZERO);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CHAR:{
        x = getValor();
        break;
        }
      case CONSTANT:{
        x = num();
        break;
        }
      default:
        jj_la1[23] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
if (x!= 0) { conde= false; }else { conde= true; }
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  final public void laCondicion() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(LB);
    condiciones();
    jj_consume_token(RB);
    todo();
}

  final public boolean recogerChips(int a) throws ParseException {
int chi = world.chipsToPick();
        if (chi >= a) { {if ("" != null) return true;}}
  else { {if ("" != null) return false;}}
    throw new Error("Missing return statement in function");
}

  final public boolean recogerBallons(int a) throws ParseException {
int globos = world.countBalloons(world.getPosition());
  if (globos >= a) { {if ("" != null) return true;}}
  else { {if ("" != null) return false;}}
    throw new Error("Missing return statement in function");
}

  final public boolean bloqueado() throws ParseException {
try {
  world.moveForward(1,false);
  world.moveForward(-1,false);
  {if ("" != null) return false;}
} catch (Exception Error){
  {if ("" != null) return true;}
}
    throw new Error("Missing return statement in function");
}

  final public boolean dondeve() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NORTH:{
      jj_consume_token(NORTH);
{if ("" != null) return world.facingNorth();}
      break;
      }
    case SOUTH:{
      jj_consume_token(SOUTH);
{if ("" != null) return world.facingSouth();}
      break;
      }
    case EAST:{
      jj_consume_token(EAST);
{if ("" != null) return world.facingEast();}
      break;
      }
    case WEST:{
      jj_consume_token(WEST);
{if ("" != null) return world.facingWest();}
      break;
      }
    default:
      jj_la1[25] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[26];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x10000000,0x10000000,0x10000001,0x3efe0,0x0,0x0,0x0,0x0,0x420,0xb00000,0x6000,0x780000,0xf000000,0x0,0x0,0x28000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xc0000000,0xf000000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x40,0x40,0x40,0x0,0x600,0x600,0x1800,0x1800,0x0,0x0,0x0,0x0,0x0,0x1800,0x1800,0x0,0x20,0x1800,0x600,0x1800,0x1800,0x600,0x1800,0x1800,0xf,0x0,};
	}

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new RobotTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[48];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 26; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 48; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
