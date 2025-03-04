public class PokemonAlreadyExistsException extends Exception {
    public PokemonAlreadyExistsException()
    {
        super();
    }

    public PokemonAlreadyExistsException(String msg)
    {
        super(msg);
    }
}
