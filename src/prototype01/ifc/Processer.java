package prototype01.ifc;

import prototype01.SelectClassName;

/**
 * 入力された情報を元に処理を行うIF
 * @author y_kusano
 *
 */
public interface Processer {

	abstract void execute(InputData inputData,SelectClassName selectClassName);
}
