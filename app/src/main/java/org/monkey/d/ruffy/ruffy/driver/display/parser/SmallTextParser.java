package org.monkey.d.ruffy.ruffy.driver.display.parser;

import org.monkey.d.ruffy.ruffy.driver.display.Symbol;
import org.monkey.d.ruffy.ruffy.driver.display.Token;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by fishermen21 on 20.05.17.
 */

public class SmallTextParser {

    private static String[][] numbers = {
            {
                    " ███ ",
                    "█   █",
                    "█  ██",
                    "█ █ █",
                    "██  █",
                    "█   █",
                    " ███ "
            },
            {
                    "  █  ",
                    " ██  ",
                    "  █  ",
                    "  █  ",
                    "  █  ",
                    "  █  ",
                    " ███ "
            },
            {
                    " ███ ",
                    "█   █",
                    "    █",
                    "   █ ",
                    "  █  ",
                    " █   ",
                    "█████"
            },
            {
                    "█████",
                    "   █ ",
                    "  █  ",
                    "   █ ",
                    "    █",
                    "█   █",
                    " ███ "
            },
            {
                    "   █ ",
                    "  ██ ",
                    " █ █ ",
                    "█  █ ",
                    "█████",
                    "   █ ",
                    "   █ "

            },
            {
                    "█████",
                    "█    ",
                    "████ ",
                    "    █",
                    "    █",
                    "█   █",
                    " ███ "
            },
            {
                    "  ██ ",
                    " █   ",
                    "█    ",
                    "████ ",
                    "█   █",
                    "█   █",
                    " ███ "
            },
            {
                    "█████",
                    "    █",
                    "   █ ",
                    "  █  ",
                    " █   ",
                    " █   ",
                    " █   ",
            },
            {
                    " ███ ",
                    "█   █",
                    "█   █",
                    " ███ ",
                    "█   █",
                    "█   █",
                    " ███ "
            },
            {
                    " ███ ",
                    "█   █",
                    "█   █",
                    " ████",
                    "    █",
                    "   █ ",
                    " ██  "
            }
    };

    private static Map<Character, String[]> letters = new HashMap<Character, String[]>();

    static {
        letters.put('A', new String[]{
                "  █  ",
                " █ █ ",
                "█   █",
                "█████",
                "█   █",
                "█   █",
                "█   █"
        });
        letters.put('B', new String[]{
                "████ ",
                "█   █",
                "█   █",
                "████ ",
                "█   █",
                "█   █",
                "████ "
        });
        letters.put('C', new String[]{
                " ███ ",
                "█   █",
                "█    ",
                "█    ",
                "█    ",
                "█   █",
                " ███ "
        });
        letters.put('D', new String[]{
                "███  ",
                "█  █ ",
                "█   █",
                "█   █",
                "█   █",
                "█  █ ",
                "███  "
        });
        letters.put('E', new String[]{
                "█████",
                "█    ",
                "█    ",
                "████ ",
                "█    ",
                "█    ",
                "█████"
        });
        letters.put('F', new String[]{
                "█████",
                "█    ",
                "█    ",
                "████ ",
                "█    ",
                "█    ",
                "█    "
        });
        letters.put('G', new String[]{
                " ███ ",
                "█   █",
                "█    ",
                "█ ███",
                "█   █",
                "█   █",
                " ████"
        });
        letters.put('H', new String[]{
                "█   █",
                "█   █",
                "█   █",
                "█████",
                "█   █",
                "█   █",
                "█   █"
        });
        letters.put('I', new String[]{
                " ███ ",
                "  █  ",
                "  █  ",
                "  █  ",
                "  █  ",
                "  █  ",
                " ███ "
        });
        letters.put('K', new String[]{
                "█   █",
                "█  █ ",
                "█ █  ",
                "██   ",
                "█ █  ",
                "█  █ ",
                "█   █"
        });
        letters.put('L', new String[]{
                "█    ",
                "█    ",
                "█    ",
                "█    ",
                "█    ",
                "█    ",
                "█████"
        });
        letters.put('M', new String[]{
                "█   █",
                "██ ██",
                "█ █ █",
                "█ █ █",
                "█   █",
                "█   █",
                "█   █"
        });
        letters.put('N', new String[]{
                "█   █",
                "█   █",
                "██  █",
                "█ █ █",
                "█  ██",
                "█   █",
                "█   █"
        });
        letters.put('O', new String[]{
                " ███ ",
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                " ███ "
        });
        letters.put('P', new String[]{
                "████ ",
                "█   █",
                "█   █",
                "████ ",
                "█    ",
                "█    ",
                "█    "
        });
        letters.put('Q', new String[]{
                " ███ ",
                "█   █",
                "█   █",
                "█   █",
                "█ █ █",
                "█  █ ",
                " ██ █"
        });
        letters.put('R', new String[]{
                "████ ",
                "█   █",
                "█   █",
                "████ ",
                "█ █  ",
                "█  █ ",
                "█   █"
        });
        letters.put('S', new String[]{
                " ████",
                "█    ",
                "█    ",
                " ███ ",
                "    █",
                "    █",
                "████ "
        });
        letters.put('T', new String[]{
                "█████",
                "  █  ",
                "  █  ",
                "  █  ",
                "  █  ",
                "  █  ",
                "  █  "
        });
        letters.put('U', new String[]{
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                " ███ "
        });
        letters.put('V', new String[]{
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                "█   █",
                " █ █ ",
                "  █  "
        });
        letters.put('W', new String[]{
                "█   █",
                "█   █",
                "█   █",
                "█ █ █",
                "█ █ █",
                "█ █ █",
                " █ █ "
        });
        letters.put('X', new String[]{
                "█   █",
                "█   █",
                " █ █ ",
                "  █  ",
                " █ █ ",
                "█   █",
                "█   █"
        });
        letters.put('Y', new String[]{
                "█   █",
                "█   █",
                "█   █",
                " █ █ ",
                "  █  ",
                "  █  ",
                "  █  "
        });
        letters.put('Z', new String[]{
                "█████",
                "    █",
                "   █ ",
                "  █  ",
                " █   ",
                "█    ",
                "█████"
        });
    }

    private static Map<Symbol, String[]> symbols = new HashMap<Symbol, String[]>();

    static {
        symbols.put(Symbol.CLOCK, new String[]{
                "  ███  ",
                " █ █ █ ",
                "█  █  █",
                "█  ██ █",
                "█     █",
                " █   █ ",
                "  ███  "
        });
        symbols.put(Symbol.UNITS_PER_HOUR, new String[]{
                "█  █    █ █   ",
                "█  █   █  █   ",
                "█  █   █  █ █ ",
                "█  █  █   ██ █",
                "█  █  █   █  █",
                "█  █ █    █  █",
                " ██  █    █  █"
        });
        symbols.put(Symbol.LOCK_CLOSED, new String[]{
                " ███ ",
                "█   █",
                "█   █",
                "█████",
                "██ ██",
                "██ ██",
                "█████"
        });
        symbols.put(Symbol.LOCK_OPENED, new String[]{
                " ███     ",
                "█   █    ",
                "█   █    ",
                "    █████",
                "    ██ ██",
                "    ██ ██",
                "    █████"
        });
        symbols.put(Symbol.CHECK, new String[]{
                "    █",
                "   ██",
                "█ ██ ",
                "███  ",
                " █   ",
                "     ",
                "     "
        });
        symbols.put(Symbol.DIVIDE, new String[]{
                "     ",
                "    █",
                "   █ ",
                "  █  ",
                " █   ",
                "█    ",
                "     "
        });
        symbols.put(Symbol.LOW_BAT, new String[]{
                "██████████ ",
                "█        █ ",
                "███      ██",
                "███       █",
                "███      ██",
                "█        █ ",
                "██████████ "

        });
        symbols.put(Symbol.LOW_INSULIN, new String[]{
                "█████████████    ",
                "█  █  █  █ ██ ███",
                "█  █  █  █ ████ █",
                "█          ████ █",
                "█          ████ █",
                "█          ██ ███",
                "█████████████    "
        });
        symbols.put(Symbol.CALENDAR, new String[]{
                "███████",
                "█     █",
                "███████",
                "█ █ █ █",
                "███████",
                "█ █ ███",
                "███████"
        });
        symbols.put(Symbol.DOT, new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                " ██  ",
                " ██  "
        });
        symbols.put(Symbol.SEPERATOR, new String[]{
                "     ",
                " ██  ",
                " ██  ",
                "     ",
                " ██  ",
                " ██  ",
                "     "
        });
        symbols.put(Symbol.ARROW, new String[]{
                "    █   ",
                "    ██  ",
                "███████ ",
                "████████",
                "███████ ",
                "    ██  ",
                "    █   "
        });
        symbols.put(Symbol.DOWN, new String[]{
                "  ███  ",
                "  ███  ",
                "  ███  ",
                "███████",
                " █████ ",
                "  ███  ",
                "   █   "
        });
        symbols.put(Symbol.UP, new String[]{
                "   █   ",
                "  ███  ",
                " █████ ",
                "███████",
                "  ███  ",
                "  ███  ",
                "  ███  "

        });
        symbols.put(Symbol.SUM, new String[]{
                "██████",
                "█    █",
                " █    ",
                "  █   ",
                " █    ",
                "█    █",
                "██████",
        });
        symbols.put(Symbol.BOLUS, new String[]{
                " ███   ",
                " █ █   ",
                " █ █   ",
                " █ █   ",
                " █ █   ",
                " █ █   ",
                "██ ████"
        });
        symbols.put(Symbol.MULTIWAVE, new String[]{
                "███     ",
                "█ █     ",
                "█ █     ",
                "█ ██████",
                "█      █",
                "█      █",
                "█      █"
        });
        symbols.put(Symbol.EXTENDED_BOLUS, new String[]{
                "███████ ",
                "█     █ ",
                "█     █ ",
                "█     █ ",
                "█     █ ",
                "█     █ ",
                "█     ██",
        });
        symbols.put(Symbol.SPEAKER, new String[]{
                "   ██ ",
                "  █ █ ",
                "██  █ ",
                "██  ██",
                "██  █ ",
                "  █ █ ",
                "   ██ "
        });
        symbols.put(Symbol.ERROR, new String[]{
                "  ███  ",
                " █████ ",
                "██ █ ██",
                "███ ███",
                "██ █ ██",
                " █████ ",
                "  ███  "
        });
        symbols.put(Symbol.WARNING, new String[]{
                "   █   ",
                "  ███  ",
                "  █ █  ",
                " █ █ █ ",
                " █   █ ",
                "█  █  █",
                "███████"
        });
        symbols.put(Symbol.PARANTHESIS_LEFT, new String[]{
                "   █ ",
                "  █  ",
                " █   ",
                " █   ",
                " █   ",
                "  █  ",
                "   █ ",
                "     "
        });
        symbols.put(Symbol.PARANTHESIS_RIGHT, new String[]{
                " █   ",
                "  █  ",
                "   █ ",
                "   █ ",
                "   █ ",
                "  █  ",
                " █   ",
                "     "
        });
    }

    private static LinkedList<Pattern> pattern = new LinkedList<>();
    static
    {
        for(Symbol s : symbols.keySet())
        {
            String[] patternString = symbols.get(s);
            Pattern p = new SymbolPattern(s,patternString,8);
            pattern.add(p);
        }
        for(int i = 0; i < 10;i++)
        {
            String[] patternString = numbers[i];
            Pattern p = new NumberPattern(i,patternString,8);
            pattern.add(p);
        }
        for(Character c : letters.keySet())
        {
            String[] patternString = letters.get(c);
            Pattern p = new CharacterPattern(c,patternString,8);
            pattern.add(p);
        }
    }
    public static Token findToken(byte[][] display, int which, int x) {
        for(Pattern p : pattern)
        {
            Token t = p.match(display,which,x);
            if(t!=null)
                return t;
        }
        return null;
    }
}