package blockly;

import cronapi.*;

@CronapiMetaData(type = "blockly")
public class Teste5 {

	/**
	 *
	 * @return Var
	 */
	// teste5
	public static Var Executar() throws Exception {
		Var item = Var.VAR_NULL;
		if (cronapi.math.Operations.isEven(Var.valueOf(2)).getObjectAsBoolean()) {
			{
			}
		} else if (cronapi.math.Operations.isOdd(Var.valueOf(3)).getObjectAsBoolean()) {
			{
			}
		}
		return item;
	}

}
