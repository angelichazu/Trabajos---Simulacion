import papermill as pm

pm.execute_notebook(
    './TareaFifa.ipynb',
    './output.ipynb',
    parameters = dict(titulo='PruebaParametros')
)