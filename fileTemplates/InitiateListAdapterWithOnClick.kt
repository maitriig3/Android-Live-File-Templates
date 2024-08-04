package ${PACKAGE_NAME}

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import in_.mai3.interviewhelper.databinding.${Binding_File}

class ${Adapter_Name}Adapter(
    private val onClick: (${Item_Type}) -> Unit
) : ListAdapter<${Item_Type},${Adapter_Name}Adapter.${Adapter_Name}ViewHolder>(DIFF_CALLBACK){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${Adapter_Name}ViewHolder {
        return ${Adapter_Name}ViewHolder(${Binding_File}.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ${Adapter_Name}ViewHolder, position: Int) {
        with(holder.binding){
            val item = getItem(position)
            
        }
    }
    
    
    inner class ${Adapter_Name}ViewHolder(val binding: ${Binding_File}): RecyclerView.ViewHolder(binding.root)

    companion object{
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<${Item_Type}>(){
            override fun areItemsTheSame(oldItem: ${Item_Type}, newItem: ${Item_Type}): Boolean {
                TODO("Not yet implemented")
            }

            override fun areContentsTheSame(oldItem: ${Item_Type}, newItem: ${Item_Type}): Boolean {
                TODO("Not yet implemented")
            }

        }
    }
    
}