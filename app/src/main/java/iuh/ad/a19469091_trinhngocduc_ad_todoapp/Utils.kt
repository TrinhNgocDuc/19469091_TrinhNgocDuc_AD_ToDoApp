package iuh.ad.a19469091_trinhngocduc_ad_todoapp

object Utils {

    fun getStatus(status: Boolean) : String {
        return when (status) {
            true -> "Completed"
            else -> "Not Completed"
        }
    }
}