package teams;

import common.Team;
import common.RSPEnum;
import common.Result;
import common.TagTeamAction;

import java.util.LinkedList;
import java.util.List;

public class KimotoSumizome implements Team {

  /**
   * こちら方Aのじゃんけんログ
   */
  private List<RSPEnum> jankenLogA;
  /**
   * こちら方Bのじゃんけんログ
   */
  private List<RSPEnum> jankenLogB;
  /**
   * 相手方Aのじゃんけんログ
   */
  private List<RSPEnum> jankenLogOpA;
  /**
   * 相手方Bのじゃんけんログ
   */
  private List<RSPEnum> jankenLogOpB;

  public KimotoSumizome() {
    this.jankenLogA = new LinkedList<>();
    this.jankenLogB = new LinkedList<>();
    this.jankenLogOpA = new LinkedList<>();
    this.jankenLogOpB = new LinkedList<>();
  }

  @Override
  public void init() {
    // TODO Auto-generated method stub

  }

  @Override
  public void before() {
    // TODO Auto-generated method stub

  }

  @Override
  public void after(Result r) {
    // TODO Auto-generated method stub

  }

  @Override
  public TagTeamAction getAction() {
    return new TagTeamAction(RSPEnum.PAPER, RSPEnum.PAPER);
  }

}
