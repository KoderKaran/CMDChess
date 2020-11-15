public enum PieceUnicodeEnum {
	W_KING("U+2654"), W_QUEEN("U+2655"), W_ROOK("U+2656"), W_BISHOP("U+2657"), W_KNIGHT("U+2658"), W_PAWN("U+2659"),
	B_KING("U+265A"), B_QUEEN("U+265B"), B_ROOK("U+265C"), B_BISHOP("U+265D"), B_KNIGHT("U+265E"), B_PAWN("U+265F");

	public String unicode;

	PieceUnicodeEnum(String unicode) {
		this.unicode = unicode;
	}
}
