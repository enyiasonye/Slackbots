package common

trait MessageFormatter {
  val EOL = "\\n"
  def mention(u:String) = s"<@$u>"
}
