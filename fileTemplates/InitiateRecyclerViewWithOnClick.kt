package ${PACKAGE_NAME}

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import in_.mai3.interviewhelper.databinding.${Binding_File}

class ${Adapter_Name}Adapter(
    private val itemList: ArrayList<${Item_Type}>,
    private val onClick: (${Item_Type}) -> Unit
) : RecyclerView.Adapter<${Adapter_Name}Adapter.${Adapter_Name}ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${Adapter_Name}ViewHolder {
        return ${Adapter_Name}ViewHolder(
            ${Binding_File}.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ${Adapter_Name}ViewHolder, position: Int) {
        with(holder.binding) {

        }
    }

    inner class ${Adapter_Name}ViewHolder(val binding: ${Binding_File}) :
        RecyclerView.ViewHolder(binding.root)

}